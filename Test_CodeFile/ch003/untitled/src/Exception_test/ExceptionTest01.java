package Exception_test;

public class ExceptionTest01 {
    public static void main(String[] args) {
        int a=1024;
        int b=0;//这里出现异常，不能够被0除
        if (b==0){
            System.out.println("被除数不可为0");
        }else {
            int c = a / b;
        }
        System.out.println("test");
    }
}
