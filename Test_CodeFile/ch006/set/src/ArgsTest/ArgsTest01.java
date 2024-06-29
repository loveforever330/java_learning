package ArgsTest;

public class ArgsTest01 {
    public static void main(String[] args) {
        //这里可以将可变参数视为一个数组

        print(1,2,3,4,5);
    }

    //这里的是可变参数，可以将可变参数看作为一个数组
    public static void print(int ...arr){
        //增强for循环
        for(int i:arr){
            System.out.println(i);
        }
    }
    //如果方法里面有多个可变的参数，那么可变参数应该放在最后
    public static void  print(String s,int flag,int ...arr){
        //这里必须要放在最后

    }

}
