import java.util.Random;
import java.util.Scanner;

public class Arithmetic {
    //要求min的值不可以大于max
    //存储对应的值
    protected int number;
    private int number_select;

    public static int result;
    public static String operator;

    public void initnumber(int number_enter) {
        this.number = number_enter;
    }

    /**
     * @param number_min 最小的值的内容
     * @param number_max 最大的值的内容
     * @return 可以计算返回true，不可以则返回false
     */
    static boolean bool_capable_of_caculate(int number_min, int number_max) {
        return number_min < number_max;
    }

    /**
     * @param number_processed 加上的数字
     * @param number_origin    被加上的数字
     * @return 返回一个加和的值的结果给用户
     */
    //下方的是java的加减乘除的函数方法
    public static int plus_numbers(int number_processed, int number_origin) {
        int sum = number_processed + number_origin;
        return sum;
    }

    /**
     * @param number_origin    初始的值
     * @param number_processed 被减去的值
     * @return 返回的是相减的结果
     */
    public static int minus_numbers(int number_origin, int number_processed) {
        int minus_numbers = number_origin - number_processed;
        return minus_numbers;
    }

    /**
     * @param number_origin    初始的值
     * @param number_processed 被减去的值
     * @return 返回的是加和的结果
     */
    public static int multiply_numbers(int number_origin, int number_processed) {
        int multiply_numbers = number_origin * number_processed;
        return multiply_numbers;
    }

    /**
     * @param number_origin    除数
     * @param number_processed 被除数
     * @return 返回的是一个被除法除完的数字
     */
    public static int divide_numbers(int number_origin, int number_processed) {
        int divide_numbers = number_origin / number_processed;
        return divide_numbers;

    }

    //java中的用于比较的函数，利用getTest即可轻松解决
    public static boolean compare_numbers(int os_number, int user_number) {
        return user_number == os_number;
    }

    public static String show_caculate_process(int number_select_min, int number_select_max, String operator) {
        String  display;
        display=Math.max(number_select_min, number_select_max) + operator + Math.min(number_select_max, number_select_min) + " = ";
        return display;
    }

    public static int judge_show(int number_select_min, int number_select_max, String operator, int result) {

            switch (operator) {
                case "+":
                    result = plus_numbers(number_select_min, number_select_max);
                    break;
                case "-":
                    result = minus_numbers((Math.max(number_select_min, number_select_max)), Math.min(number_select_min, number_select_max));
                    break;
                case "*":
                    result = multiply_numbers(number_select_min, number_select_max);
                    break;
                case "/":
                    result = divide_numbers(Math.max(number_select_min, number_select_max), Math.min(number_select_min, number_select_max));
                    break;
                default:
                    System.out.println("you enter is wrong");
                    break;
            }
        return  result;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //两个类
        Arithmetic Number_min = new Arithmetic();
        Arithmetic Number_max = new Arithmetic();
        //用于确定的两类整数
        Number_min.initnumber(input.nextInt());//控制台内输入对应的整数，用于最小值的确定
        Number_max.initnumber(input.nextInt());//控制台内输入对应的整数，用于最大值的确定
/**
 if (bool_capable_of_caculate(Number_min.number, Number_max.number)) {//判断大小问题
 Random random = new Random();//ok
 Number_min.number_select = random.nextInt(Number_min.number + 1) + (Number_max.number - Number_min.number);
 Number_max.number_select = random.nextInt(Number_min.number + 1) + (Number_max.number - Number_min.number);
 }
 result=0;
 operator = input.next();
 switch (operator) {
 case "+":
 result = plus_numbers(Number_min.number_select, Number_max.number_select);
 break;
 case "-":
 result = minus_numbers((Math.max(Number_max.number_select, Number_min.number_select)), Math.min(Number_max.number_select, Number_min.number_select));
 break;
 case "*":
 result = multiply_numbers(Number_min.number_select, Number_max.number_select);
 break;
 case "/":
 result = divide_numbers(Math.max(Number_max.number_select, Number_min.number_select), Math.min(Number_max.number_select, Number_min.number_select));
 break;
 default:
 System.out.println("you enter is wrong");
 break;
 }
 show_caculate_process(Number_min.number_select, Number_max.number_select,operator,result);
 **/
//将其转换为对应的函数即可达成目标。
        System.out.println(compare_numbers(result, result));
    }
}
