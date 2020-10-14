import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        System.out.println("please enter the two two integer values that you want" + " to complete the operation with ");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println(" please enter the operation you want preformed");
        String opera = scan.next();
        int sec = scan.nextInt();
        System.out.println(" Here is the answer");
        int value = Acalc(opera, first, sec);
        String roman = Roman(value);
        System.out.println(" Here is the answer in roman numerals ");
        System.out.println(roman);
    }

    public static int Acalc(String opera, int n1, int n2){
        int result = 0;
        //Write the calulator

        if (opera.equals("+")) {result=n1+n2;}

        if (opera.equals("-")) {result=n1-n2;}

        if (opera.equals("*")) {result=n1*n2;}

        if (opera.equals("/")) {result=n1/n2;}

        System.out.println(result);

        return result;
    }

    public static String Roman(double input){

        String s = "";

        if (input <1 || input < 999)
            System.out.println("negative roman numeral value ");

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}