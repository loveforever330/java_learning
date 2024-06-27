package String_buffer;

public class String_Buffer_test {
    public void change_string(String a){
        a+="jaav";
    }
    public  void change_stringbuffer(StringBuffer s_b){
        s_b.append("java");
    }
    public static void main(String[] args) {
        StringBuffer s_a=new StringBuffer("abc");
        s_a.append("def");
        System.out.println(s_a);
        s_a.insert(3,"120");//位于3号位置处
        System.out.println(s_a);
        s_a.delete(3,6);
        System.out.println(s_a);
        String_Buffer_test a=new String_Buffer_test();
        //测试引用数据类型的字符串拼接工作
        //测试基本数据类型的字符串的拼接工作
        String test=new String("abc");
        a.change_string(test);
        a.change_stringbuffer(s_a);
        System.out.println(s_a.toString());//string buffer的可以
        System.out.println(test);//string的不行，因为是在常量池中的,所以不行
    }
}
