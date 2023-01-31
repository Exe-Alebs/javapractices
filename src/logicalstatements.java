import java.util.Scanner;
public class logicalstatements {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int population = read.nextInt();
        int area = read.nextInt();
        if (population < 10000 && area < 10000){
            System.out.println("the country uis too small");
        }

    }
}
