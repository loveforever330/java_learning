package string;

public class String_api {
    public static void main(String[] args) {
        String s1 = "monkey1024";
// char charAt(int index);获取index位置的字符
        System.out.println(s1.charAt(5));
// boolean contains(CharSequence s);判断字符串中是否包含某个字符串
        System.out.println(s1.contains("key"));
// boolean endsWith(String endStr);判断是否是以某个字符串结尾
        System.out.println(s1.endsWith("1028"));
// boolean equalsIgnoreCase(String anotherString);忽略大小写比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase("Monkey1024"));
// byte[] getBytes();转换成byte数组
        String s2 = "abc";
        byte[] b1 = s2.getBytes();
        for(int i=0; i<b1.length; i++){
            System.out.print(b1[i] + " ");//转换成为二进制数组的内容
        }
        System.out.println();
// int indexOf(String str);取得指定字符在字符串的位置
        System.out.println(s1.indexOf("y"));
// int indexOf(String str, int fromIndex);从指定的下标开始取得指定字符在字符串的位置
        String s3 = "monkey1024monkeyy";
        System.out.println(s3.indexOf("y", 6));
// int lastIndexOf(String str);从后面开始取得指定字符在字符串最后出现的的位置
        System.out.println(s3.lastIndexOf("y"));
// int length();获取字符串的长度
        System.out.println(s3.length());
// String replaceAll(String s1,String s2);替换字符串中的内容
        String s4 = "monkeymonkey1024monkey";
        System.out.println(s4.replaceAll("key", "YYY"));
// String[] split(String s);根据指定的表达式拆分字符串
        String s5 = "a,b,c,d";
        String[] array1 = s5.split(",");
        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
// boolean startsWith(String s);判断是否是以某个字符串开始
        System.out.println(s3.startsWith("m1"));
// String substring(int begin);根据传入的索引位置截子串
        System.out.println(s3.substring(5));
// String substring(int beginIndex, int endIndex);根据传入的起始和结束位置截子串
        System.out.println(s3.substring(6, 10));
// char[] toCharArray();将字符串转换为char数组
        char[] array2 = s5.toCharArray();
        for(int i=0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
// void toUpperCase();转换为大写
        System.out.println(s5.toUpperCase());
// void toLowerCase();转换为小写
        System.out.println(s5.toLowerCase());
// String trim();去除首尾空格
        String s6 = " java good ok ";
        System.out.println(s6.trim());
// String valueOf(Object obj);将其他类型转换为字符串类型
        Object o = new Object();
        o = null;
        System.out.println(String.valueOf(o));//建议使用这种方法转换字符串
//System.out.println(o.toString());//报出空指针错误
    }
}
