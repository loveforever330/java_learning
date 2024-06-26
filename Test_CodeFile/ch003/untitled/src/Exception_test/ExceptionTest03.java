package Exception_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try {//自己对其进行对应的处理，
            FileInputStream fileInputStream=new FileInputStream("D:/monkey");
        } catch (FileNotFoundException e) {//下面是对我们没找到的catch语句的对应的操作
            //没有出现错误的时候，不会出现任何的异常

            throw new RuntimeException(e);
        }
        catch (NullPointerException e){
            //无论多少个catch，只会有一个执行
            //一定会是从小到大的，
        }
        catch (Exception e){
            //最大的要放置到最后，顺序从小到大，先去catch子类，然后catch父类


        }
    }
}
