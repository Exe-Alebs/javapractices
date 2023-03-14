/*

You need a program to manage admissions for an art school. Pupils can be admitted to the school if they are over 6 years of age.
You're given a program which declares a Pupil class.

Task
Complete the setAge method of the Pupil class. If the value of parameter a is over 6, assign it to age attribute and output "Welcome".
Output "Sorry" otherwise.
 */
import java.util.Scanner;

public class EncapsulationS {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

    }
}

class Pupil{
    private int age;
    public void setAge(int a)
    {
        if (a > 6) {
            age = a ;
            System.out.println("Welcome");
        }else {
            System.out.println("Sorry");
        }
    }

    public int getAge() {
        return age;
    }
}
