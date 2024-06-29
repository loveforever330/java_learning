package Timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timer t= new Timer();//定时任务

        t.schedule(new MyTimerTask(),new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS").parse("2024-06-29 16:43:40 000"),5000);
    }
}

/**
 * 继承自TimerTask类，将要执行的定时任务编写在run方法中
 *
 */

class   MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Great");
    }
}
