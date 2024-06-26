package Test_to_Strng;

public class Test_String {
    private int age;
    private String name;
    public Test_String(int age, String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return "[name: "+name+",age: "+age+" ]";
    }
}
class Main{
    public static void main(String[] args) {
        Test_String test_string=new Test_String(12,"ab");
        System.out.println(test_string.toString());
        System.out.println(test_string);//这里表示的含义就是它print出来的结果是这样的，
        //是将打印的toString方法的结果重写了



    }
}
