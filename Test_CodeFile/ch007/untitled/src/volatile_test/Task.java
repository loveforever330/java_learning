package volatile_test;

public class Task implements Runnable{
    private  volatile   boolean flag =true;//这里没能进入死循环，可能是更新的缘故，也有可能是主线程修改之后，T1线程隔一段时间才会过去
//只能够放在变量的上面，不可以放在方法上
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public boolean getFlag(){
        return flag;
    }
    @Override
    public void run() {
            while(flag){
                System.out.println("while循环");
            }
        System.out.println("循环结束");
    }
}
