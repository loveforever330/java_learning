public class Studentstatic {
    private int id;
    private boolean sex;

    private  String name;

    static String company="abc";//开发中往往会采用类名Student.company的方式去访问静态变量的内容；

    public static String get(){
       return "nih";
    }

    public Studentstatic(){   //构造函数，可以自己这样写，也可以含有参数的写，一起写意味着重载
        //this(1,false,"gods");,如果这样调用，会需要放在第一行。
        System.out.println("初始化创建对象中");

    }

    public Studentstatic(int id, boolean sex, String name){//含有参数的构造方法；
        this.id=id;
        this.name=name;
        this.sex = sex;
    }
}
