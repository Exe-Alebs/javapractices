/*
you are the administrator of a hotel  and must create customer information cards for your new customers
on the card you must note the customers first anf last name age and room number
 */

import java.beans.Customizer;
import java.util.Scanner;
public class classattributes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String lastName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        {
            customer.firstName = firstName;
            customer.secondName = lastName;
            customer.age = age;
            customer.roomnumber = roomNumber;
            customer.saveCustomerInfo();
        }


    }
}

class Customer{
     String firstName;
     String secondName;
     int age;
     int roomnumber;

    public void saveCustomerInfo(){
        System.out.println("First Name: " + firstName);
        System.out.println("Second Name: " + secondName);
        System.out.println(" age: " + age);
        System.out.println("Room number : " + roomnumber);
    }
}