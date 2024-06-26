package test_super;

public class Animal {
    String name;
    String color;
    String catagory;
    public Animal(){
        System.out.println("Animal的构造方法内容");
    }
    public Animal(String color,String catagory,String name){
        this.color=color;
        this.catagory=catagory;
        this.name=name;
    }
    public void  m1(){
        System.out.println("color:"+this.color+"\n"+"catagory: "+this.catagory+"\nname: "+this.name);

    }

}
