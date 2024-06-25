public class TestStudent {
    public static void main(String[] args) {//在主类里面才可以调用另一个对象，并且对其做出相对应的操作
        Student student=new Student();  //默认的隐式构造方法，如果不自己写的话，也会自动分配一个构造对象
        Student student_test=new Student(1,true,"genco");//自己写的显式构造方法，可以传入参数进入其中

        student.setId(2);
        student.setName("abc");//保留的接口，可以访问内部变量和返回外部变量的值的方法
        student.setSex(false);

        System.out.println("id: "+student.getId()+" name: "+student.getName()+"\n");
        System.out.println("id: "+student_test.getId()+" name: "+student_test.getName()+"\n");
        System.out.println(student.changeStudent(student_test));

        System.out.println("id: "+student_test.getId()+" name: "+student_test.getName()+"\n");
    }


}
