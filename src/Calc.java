import java.util.Scanner;
 public class Calc{
     public static void main (String[] args){
         Scanner scores = new Scanner(System.in);
         // taking initial scores
         int initScore = scores.nextInt();
         int scoreTom = initScore;
         int scoreBob = initScore;

         System.out.println("Round 2 Results:");
         System.out.println(++scoreTom);
         System.out.println(--scoreBob);
     }
 }