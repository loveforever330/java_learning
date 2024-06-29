package DeadThread;

public class DeadThread {
    private  static Object obj1=new Object();
    private static Object obj2=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                synchronized (obj1){
                    System.out.println(this.getName()+"======obj1");
                    synchronized (obj2){
                        System.out.println(this.getName()+"======obj2");
                    }
                }
            }
        };


        Thread t2=new Thread(){
            @Override
            public void run() {
                synchronized (obj2){
                    System.out.println(this.getName()+"======obj1");
                    synchronized (obj1){
                        System.out.println(this.getName()+"======obj2");
                    }
                }
            }
        };

        //这里都是等待对方的资源
        t1.start();
        t2.start();

    }

}
