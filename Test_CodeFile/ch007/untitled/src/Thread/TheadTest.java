package Thread;


class Mythead extends Thread{
    //重写run方法
    @Override
    public void run() {
        //3.将要在线程中执行的代码编写在run方法里面的内容
        for(int i=0;i<10;i++){//这样子将会导致cpu的空闲时间无法确定

            System.out.println("MoMo");
        }
    }
}
public class TheadTest {
    public static void main(String[] args) {
        Mythead mt=new Mythead();

        //调用start方法，这里就会开始启动对应的线程
        mt.start();

        for(int i=0;i<10;i++){//二者将会交替的进行
            System.out.println("Genco");
        }
    }
}

