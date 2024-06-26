package 多态优点;

public class Person {
//    public void drive(Benz benz){
//        benz.run();
//    }
//    public void drive(BMW bmw){
//        bmw.run();
//    }

//上面的利用多态可以提高代码的扩展性，Car里面的内容包括了两个子类，所以只需要修改对应的车子类即可
    public void drive(Car car){
        car.run();
    }

}
