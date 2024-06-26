public class Statictest03 {
    static{
        System.out.println("静态语句块1");
    }
    static{
        System.out.println("静态语句块2");
    }

    static{
        System.out.println("静态语句块3");
    }

    //构造方法
    Statictest03(){
        System.out.println("构造方法");
    }

    public static void main(String[] args){
        System.out.println("main main方法 1");
        System.out.println("main main方法 2");
        new Statictest03();
        new Statictest03();//静态语句块只执行了一次,自上而下的去执行对应的内容。
    }
}
