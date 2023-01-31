import java.util.Scanner;
public class nestedconditionals {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int purchases = read.nextInt();
        if (purchases > 15000){
            System.out.println("Gift Card");
            if (purchases > 30000){
                System.out.println("You get another Gift Card");
            }
        }
    }
}
