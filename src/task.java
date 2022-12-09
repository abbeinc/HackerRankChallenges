import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task {


    public static int exchange;
    public static int[] arrA=new int[4];
    public static int cent5, cent1, cent10, cent25;
    public static int[] calculate(int x) {
        if(x>99){
           x=x%100;


        exchange=100-x;

        cent25=exchange/25;
        exchange=exchange%25;
        cent10=exchange/10;
        exchange=exchange%10;
        cent5=exchange/5;
        exchange=exchange%5;
        cent1=exchange;
        arrA[0]=cent25;
        arrA[1]=cent10;
        arrA[2]=cent5;
        arrA[3]=cent1;}
        return  arrA;
}


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = 106876826;
        int [] exch =calculate(x);
        System.out.println(Arrays.toString(exch));


    }



}
