package Thread_join;

public class Thread_join {


    public static void main(String[] args) {
        Thread t_one =new Thread() {
            public void run() { //方法的重写

                for (int i = 0; i < 10; i++) {
                    System.out.println("leader");
                }
            }
        };

        Thread t_two =new Thread(){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    if(i==8){
                        //线程上进行礼让
                        try {
                            //t1的线程加入的操作
                            t_one.join();//加入之后会变成一个线程
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("mentor");
                }
            }
        };

        t_one.start();
        t_two.start();
    }

}
