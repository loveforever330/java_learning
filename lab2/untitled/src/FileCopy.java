import java.io.*;
import java.nio.file.Files;

public class FileCopy {
    /**
     * @param f1_src src路径 -判断是否为f2文件的祖先或者自身
     * @param f2_dst dst路径 -目录路径
     * @return 返回bool类型变量
     */
    private static boolean formerisAncestor(File f1_src, File f2_dst) {
        String f2_parent= f2_dst.getParent();//获取目标文件的祖先
        String f1_path= f1_src.getPath();//获取源文件的文件路径
        String f2_path=f2_dst.getPath();
        String f1_parent= f1_src.getParent();



    if(f1_src.equals(f2_dst)||f1_parent.equals(f2_path)) {
        System.out.println("文件已经存在或者目标目录位置是源文件本身或其祖先");
        return false;
    }
    else if(!f1_src.exists()){
        System.out.println("无法找到对应文件内容");
        return  false;
    }
    else {
        System.out.println("可以被拷贝");
        return true;
    }
    }

    private static boolean copyTo(File src, File dst) {
        try (
                BufferedInputStream input = new BufferedInputStream(Files.newInputStream(src.toPath()));
                BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(dst.toPath()));
        ) {
            int r, number_bytes_read = 0;
            while ((r = input.read()) != -1) {//转换成为字节码的读取
                output.write((byte)r);
            }
        } catch (IOException e) {//捕获异常
            throw new RuntimeException(e);
        }
        return true;
    }
    /**
     * @param args 数组参数做一个对应的工作即可
     */
    public static void main(String[] args) {
        String s1=args[0];
        if(!args[1].equals("--#")) System.out.println("拷贝符号错误，请重新启动并输入");
        String s2=args[2];
        File src = new File(args[0]);
        File dst = new File(args[2]);
        if (formerisAncestor(src, dst))//源文件是否为目标文件的祖先判断
        {

            System.out.println("恭喜，可以被拷贝");
            if(copyTo(src,dst)){//拷贝是否正确
                System.out.println("文件已经成功拷贝");
            }
            else {
                System.out.println("错误");
            }
        }
        else System.out.println("目标位置是源位置的祖先");
    }
}