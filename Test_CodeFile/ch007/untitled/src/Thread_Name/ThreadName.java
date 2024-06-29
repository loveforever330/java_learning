package Thread_Name;

public class ThreadName {
    public static void main(String[] args) {
        new Thread("MoMo"){
            @Override
            public void run() {
                System.out.println(this.getName()+" is the bets love of Genco");
                //调用这个线程对应的名字
            }
        }.start();

        new Thread("Genco"){
            @Override
            public void run() {
                System.out.println(this.getName()+" is the best love of Momo");
                //调用这个线程的名字
            }
        }.start();

        //还有另外的一种设计线程的名字的方法
        new Thread(){
            @Override
            public void run() {
                this.setName("Genco");//在这里设置名字
                System.out.println(this.getName()+" Love MoMo");
            }
        }.start();

        Thread t2=new Thread(){
            @Override
            public void run() {
                System.out.println(this.getName()+" wait ");
            }
        };
        t2.setName("Genco");//另外的一种设置线程名字的方法
        t2.start();
    }
}
