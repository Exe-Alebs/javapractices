import java.util.Scanner;
public class summingarrrayelements {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        int sum = 0;
        int [] arrayname = new int[length];
        for (int i = 0; i < length ; i++) {
            arrayname[i] = read.nextInt();
            if (arrayname[i]%4==0){
                sum += arrayname[i];
            }
        }
        System.out.println(sum);
    }
}
