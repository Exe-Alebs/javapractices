/*
you are creating a robot. "Welcomer 2000", that never fails to greet a single person its encounters.
you provide the number of people ths will enter the room and the robot will shout "Wellcome" that many times
 */

import java.util.Scanner;
public class oop {

    static void welcome(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberOfPeople = read.nextInt();
        for (int i = 0; i < numberOfPeople; i++) {
            welcome();
        }
    }
}
