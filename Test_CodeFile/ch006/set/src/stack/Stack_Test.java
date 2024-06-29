package stack;

import java.util.LinkedList;

public class Stack_Test {

    private LinkedList List=new LinkedList<>();

    public   void push(Object c){
        List.addLast(c);
    }
    public  Object pop(){
        return     List.removeLast();

    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty()
    {
        return List.isEmpty();
    }


}
class Main{
    public static void main(String[] args) {
        Stack_Test stackTest=new Stack_Test();
        stackTest.push("a");
        stackTest.push("b");
        stackTest.push("e");
        stackTest.push("f");

        while (!stackTest.isEmpty()){
            System.out.println(stackTest.pop());
        }
    }
}