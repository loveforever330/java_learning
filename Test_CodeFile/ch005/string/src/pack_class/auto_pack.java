package pack_class;

public class auto_pack {
    public static void main(String[] args) {
        Integer i1=10;
        //自动装箱的操作,就是将基本数据类型自动转换为相对应的包装类

        //自动拆箱的操作

        Integer i2=new Integer(20);
        int i3=i2;

        Integer i5 =888;
        Integer i4=888;
        System.out.println(i5 ==i4);

        Integer i6=-128;
        Integer i7=-128;
        System.out.println(i6==i7);//这里是由于整型常量池 -128~127是位于java中的整型常量池


    }
}
