//convert days to seconds
import java.util.Scanner;
public class converter {
    public static void main(String[] args){
        Scanner convert = new Scanner(System.in);
                int days = convert.nextInt();
                int hour = 24 * days;
                int minutes = 60 * hour;
                int sec = 60 * minutes;
                System.out.println(sec);

    }
}
