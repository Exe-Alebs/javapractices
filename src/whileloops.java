import java.util.Scanner;
public class whileloops {
     public static void main(String[] args) {
    Scanner calculate = new Scanner(System.in);
    int number = calculate.nextInt();
    int fact = 1;
    while (number > 1){
        fact *= number--;
    }
    System.out.println(fact);
    }
}
