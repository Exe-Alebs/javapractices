import java.util.Scanner;
public class dowhileloops {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password;
        do{
            System.out.println("Write password");
            password = read.nextInt();
        }while (password != 8819);
    }
}
