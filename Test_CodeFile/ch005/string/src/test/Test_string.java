package test;

public class Test_string implements TestString{
    private  String test;
    @Override
    public void set(String string) {
        this.test=string;
    }

    @Override
    public String get() {
        return this.test;
    }

    @Override
    public String reverse(String reverse_test) {
        String temp=reverse_test;
        char[] temp_test=new char[temp.length()];
        temp_test=temp.toCharArray();
        for(int i=0;i<temp.length()/2;i++){
               char local=temp_test[i];
               temp_test[i]=temp_test[temp_test.length-i-1];
               temp_test[temp_test.length-i-1]=local;
        }
        reverse_test=String.valueOf(temp_test);
        return reverse_test;
    }

    @Override
    public void show() {
        System.out.println("string is "+this.test);
    }

    public int find_string(String src,String dst){
        int count = 0;
        int pos=0;
        int i=0,j=0;
        char [] dst_temp =new char[dst.length()];
        char[] temp=new char[src.length()];
        temp=src.toCharArray();//简易版的kmp的算法匹配
        dst_temp=dst.toCharArray();
        for( i=0;i< temp.length;i++){
            for( j=0;j< dst_temp.length;j++){
                if(dst_temp[j]==temp[i])
                {
                    i++;
                }
                else if(dst_temp[j]!=temp[i]) {
                    break;
                }
            }
            if(j== dst_temp.length){
                count++;
            }

        }

        return count;
    }


}
class  main{
    public static void main(String[] args) {
            String a=new String("abcdwdsdswadq");
            TestString testString=new Test_string();
            testString.set(testString.reverse(a));
            testString.show();
        System.out.println(testString.find_string("abcdefbdeabcedsdadabc","abc"));
    }
}