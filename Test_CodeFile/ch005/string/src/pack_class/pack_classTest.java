package pack_class;

public class pack_classTest {
    /**
     * Byte byte
     * short Short
     * integer Integer
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer i=new Integer(100);
        Integer i1=new Integer("122");//Error :报错，会因为无法成功的转换出错
        System.out.println(i1);
        //将Integer类型转换
        int i4=Integer.parseInt("102");
        System.out.println(i4);
        //转换int为integer的类型的

        Integer i5=Integer.valueOf(8);

    }
}
