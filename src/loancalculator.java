/*you are getting a loan from a friend and need to calculate how much you will owe him after three months
you are going to pay him back 10% of the remaining amount each month.
Calculate a program that's take the loan amount as an input and calculates outputs the remaining amount
 */

import java.util.Scanner;

public class loancalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        for (int x = 0;x < 3;x++) {
            amount -= ((amount * 10) / 100);
        };
        System.out.println(amount);
    }
}


