/*
your company is writing a program for a geometry course.
the program takes the number of squares as the first input creates an array, and the takes the
sides of squares as its element.
write the part of  the program that receives a list of  square sides and prints the area of those squares fot the
user.

 */
import java.util.Scanner;
public class enhancedforloop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        int[] sidesofsquare = new int[length];
        for (int i = 0; i < length; i++) {
            sidesofsquare[i] = read.nextInt();
            System.out.println(sidesofsquare[i] * sidesofsquare[i]);
        }
    }
}
