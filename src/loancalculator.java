/*you are getting a loan from a friend and need to calculate how much you will owe him after three months
you are going to pay him back 10% of the remaining amount each month.
Calculate a program that's take the loan amount as an input and calculates outputs the remaining amount
 */

import java.util.Scanner;
public class loancalculator {
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      int amount = read.nextInt();
      int remaining = amount;
      for (int i = 0;i<3; i++){
          int payment = ((amount *10)/100);
          remaining = amount - payment;
          amount = remaining;
          System.out.println(remaining);
      }
    }

}
