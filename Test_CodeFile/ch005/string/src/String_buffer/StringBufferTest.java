package String_buffer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer s_b=new StringBuffer();//16
        System.out.println(s_b.capacity());
        StringBuffer s_v=new StringBuffer("abc");//19=16+3
        System.out.println(s_v.capacity());
        StringBuffer s_c=new StringBuffer(100);//一般采用这种方式来进行定义。
        System.out.println(s_c.capacity());
    }
}
