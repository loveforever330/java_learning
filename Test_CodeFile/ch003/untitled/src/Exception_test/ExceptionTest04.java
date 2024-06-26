package Exception_test;

public class ExceptionTest04 {
    public static void main(String[] args) {
            int result =m1();
        System.out.println(result);//先执行了finally，执行完成之后再返回main方法之后的语句
    }
    public static  int m1(){
        try{
            int i=1024;//try里面的变量在外部无法被访问的
            return i;//这里会报错，没有返回语句
            //System.exit(0);//让jvm退出，finally语句不会被执行

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally中的语句");
        }
        return  10;
    }

}
