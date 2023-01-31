import java.util.Scanner;
public class switchexpressions {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int day = read.nextInt();
        String dayType = switch(day) {
            case 1,2,3,4,5 -> "Working day";
            case 6,7 ->"weekend";
            default -> "invalid day";
        };
        System.out.println(dayType);
    }
}
