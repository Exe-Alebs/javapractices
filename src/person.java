public class person {
    //state of aan object
    int age;
    String name;

    // behavior of an object
    public void set_value(){
        age = 23;
        name = "Alebs";
    }
    public void get_value(){
    System.out.println("My age is " + age);
    System.out.println("Name is " + name);
}

//main method
public static void main(String[] args){
//creates a new person object
person p = new person();

// change state through behaviour
p.set_value();
}
}