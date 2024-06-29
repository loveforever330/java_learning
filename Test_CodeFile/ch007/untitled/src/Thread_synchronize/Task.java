package Thread_synchronize;

public class Task {
    //多个线程共享堆内存，多个线程可以同时调用这个方法修改这个值，会造成结果和想要的不一样的问题
    /*
    想法:某一时间段锁死一个线程即可
     */
    private int Num=0;


    //同步和异步
    //加入synchronized关键字,某一个时间段只有一个
    public  synchronized void change_num(boolean flag){

        if(flag){
            Num=88;
            System.out.println("---------------begin");
            System.out.println("--------------"+Num);
            System.out.println("---------------end");
        }
        else{
            Num=66;
            System.out.println("---------------begin");
            System.out.println("--------------"+Num);
            System.out.println("---------------end");
        }
    }
}

/**
 * 使用多线程运行task中的方法
 *
 */
class Synchronize{
    public static void main(String[] args) {
        Task task=new Task();

        //如果使用两个对象的话，那么就也不会发生安全问题
        //可是线程的并不是同一个线程的执行，所以begin和end会由cpu分配时间执行


        //Task task1=new Task();//可以使用的注释
        Thread t1=new Thread(){
            @Override
            public void run() {
                task.change_num(true);
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                task.change_num(false);
            }
        };

        //发现两边的值是相同的！
        //这样很明显是不对的，因为二者是共享了内存，共享了同一块的内存
        //涉及到线程安全的问题上，如果两个都对其进行修改，将会造成问题


        t2.start();
        t1.start();



    }
}
