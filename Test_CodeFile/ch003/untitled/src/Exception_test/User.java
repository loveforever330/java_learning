package Exception_test;

public class User {

    //完成用户注册
    public void register(String user_name) throws IllegalNameException {//通过throw在方法体里面异常
        if(user_name.length()<6){
            //抛出一个非法用户名的异常，自己定义设计
            //用throw而不是throws
            throw new IllegalNameException("用户名长度不小于6");//自定义异常上没有任何问题
            //只能够throw其中的一个对象。

        }
        //这里将会输出注册成功
        System.out.println("注册成功");
    }

}
/**
 * Throws：
 * 用在方法声明后面，跟着的是异常类名
 * 可以跟着多个异常类名，使用逗号间隔开
 * 表示抛出异常，从而将该方法的调用者进行处理
 */
/**
 * Throw：
 * 用在方法体内，用的是异常对象名，只能够抛出一个异常对象名
 * 表示抛出异常，由方法体内的语句对其进行处理
 *
 */