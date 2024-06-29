package volatile_test;

public class Tasktest {
    public static void main(String[] args) throws InterruptedException {
        Task task=new Task();

        Thread t1=new Thread(task){

        };
        t1.start();
        Thread.sleep(100);//如果像这样主进程一直睡眠的话，意味着只能不断循环，
        task.setFlag(false);


    }
}
