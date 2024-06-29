package Sleep;

/**
 * Thread中的让当前线程睡眠的sleep方法
 */
public class Thread_Sleep {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 10; i >0 ; i--) {
//            System.out.println("倒计时："+i);
//            Thread.sleep(1000);//睡眠一秒
//        }

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);//让当前的线程睡眠指定的时间
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("MoMo");
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    try {
                        Thread.sleep(1000);//让当前的线程睡眠指定的时间
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Genco");
                }
            }
        }.start();
    }
    //按照上面的操作，将可以使得这里是并发执行的操作，一个睡眠之后另一个继续


}
