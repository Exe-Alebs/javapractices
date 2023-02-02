/*
you are an assistant  on a  tv show where celebrities are dancing and 4
judges evaluate their performance and give them a score between 1 and 10
 */

import java.util.Scanner;
public class methodretiurntypes {
    public static double getAverageSCore( double a , double b, double c, double d) {
        return ((a + b + c + d) / 4);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageSCore(score1,score2,score3,score4);{
            System.out.println(avgScore);
        }
    }
}
