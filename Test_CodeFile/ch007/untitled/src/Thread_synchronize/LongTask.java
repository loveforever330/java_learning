package Thread_synchronize;

public class LongTask {
    private int Num = 0;


    //同步和异步
    //加入synchronized关键字,某一个时间段只有一个
    public void change_num(boolean flag) {//这里是同步的

        try {
            //假设这里其中有一个较长的任务，且不涉及线程安全问题
            //交替执行，异步执行可能会消耗三秒

            Thread.sleep(3000);//这里把这里也同步进去等待了
            System.out.println("执行一个耗时较长任务");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Object c=new Object()//Error:这里会报错，成员变量，这里将会由于每一次都会创建一个新的对象，所以他们的对象不同

        synchronized (this) {//传入的对象什么都可以，一定需要保证这几个线程所访问的都是同样的一个对象
            //传入的对象是一致的才行


            //只需要同步这一块的代码就足够了
            if (flag) {
                Num = 88;
                System.out.println("---------------begin");
                System.out.println("--------------" + Num);
                System.out.println("---------------end");
            } else {
                Num = 66;
                System.out.println("---------------begin");
                System.out.println("--------------" + Num);
                System.out.println("---------------end");
            }
        }
    }

}
