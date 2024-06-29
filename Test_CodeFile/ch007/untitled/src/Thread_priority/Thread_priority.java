package Thread_priority;

/**
 * Thread中的setPriority的方法,
 */
public class Thread_priority {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("test");
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("1024");
                }
            }
        };

//        t1.setPriority(1);
//        t2.setPriority(8);

        //一般采用这种方式来设置优先级

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

    }
}
