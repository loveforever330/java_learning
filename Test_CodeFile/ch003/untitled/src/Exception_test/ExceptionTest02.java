package Exception_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {
    public static void main(String[] args) throws FileNotFoundException {//可以查看api找到要抛出的异常，如果不抛出，会出错

        FileInputStream fileInputStream=new FileInputStream("D:/os_课程设计");
    }




}
