public class Student {
    private int id;
    private boolean sex;

    private  String name;

    public Student(){   //构造函数，可以自己这样写，也可以含有参数的写，一起写意味着重载
        System.out.println("初始化创建对象中");
    }
    public Student(int id, boolean sex, String name){//含有参数的构造方法；
        this.id=id;
        this.name=name;
        this.sex = sex;
    }

    public boolean changeStudent(Student student_1){
        if(student_1.id==1){
            //有趣的一点，这里默认如果不加student_1的话，调用的id将会是this.id,即为调用这个函数对象的id，和我们的想法相悖了
            //引用传递的时候一定会需要判断一下对象才行。
            student_1.setName("test changeStudent");
            return true;
        }
        else {
            return  false;
        }
    }
    public void setId(int id){
        this.id=id;
    }

    public int getId() {
        return this.id;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean getSex(){
        return this.sex;
    }

    public String getName() {
        return name;
    }
}
