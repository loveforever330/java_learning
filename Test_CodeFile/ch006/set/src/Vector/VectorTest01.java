package Vector;
import java.util.Enumeration;
import java.util.Vector;
public class VectorTest01 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");

        Enumeration e=v.elements();//这里用这个来进行遍历的操作
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
