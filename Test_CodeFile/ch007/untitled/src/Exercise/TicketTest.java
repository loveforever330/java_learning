package Exercise;

public class TicketTest {

    public static void main(String[] args) {
        Ticket ticket=new Ticket();

        Thread t1=new Thread(ticket,"a");
        Thread t2=new Thread(ticket,"b");
        Thread t3=new Thread(ticket,"c");

//这里会有线程安全的问题，即都卖出了之后，剩余依然还有很多

        t1.start();
        t2.start();
        t3.start();


    }
}
