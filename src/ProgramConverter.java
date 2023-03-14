
import java.util.Scanner;

import java.util.Scanner;

//your code goes here
 class Converter{
    public static String toBinary(int num){

        String binary="";

        while(num > 0) {
            binary = (num%2)+binary;
            num /= 2;}
        return binary;
    }

}

public class ProgramConverter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}