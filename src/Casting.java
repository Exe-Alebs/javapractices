import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char a = read.next().charAt(0);

        //your code goes here
        int b = (int) a;
        System.out.println(b);
    }
}