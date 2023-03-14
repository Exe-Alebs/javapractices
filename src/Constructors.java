
/*
Your friend is a cashier at a movie theater. He knows that you are an awesome java developer so he asked you to help him out and create a program that gets movie title, row, and seat information and prints out a new ticket.
Complete the existing code by adding a constructor to Ticket class so that it can be correctly initialized.

 */
import java.util.Scanner;

public  class Constructors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String movie = input.nextLine();
        int row = input.nextInt();
        int seat = input.nextInt();
        Ticket ticket = new Ticket(movie, row, seat);
        System.out.println("Movie:" + ticket.getMovie());
        System.out.println("Row:" + ticket.getRow());
        System.out.println("Seat:" + ticket.getSeat());


    }
}

class Ticket {
    private String movie;
    private int row;
    private int seat;

    public Ticket(String movie, int row, int seat){
        this.movie= movie;
        this.row = row;
        this.seat = seat;
    }
    public String getMovie(){
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}