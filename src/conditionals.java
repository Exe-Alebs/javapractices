import java.util.Scanner;
public class conditionals {
    public static void main(String[] args){
        Scanner carPrice = new Scanner(System.in);
        int price = carPrice.nextInt();
        if (price < 12000)
        {
            System.out.println("yes he can buy the car");
        } else {
            System.out.println("Broke boy");
        }
    }
}
