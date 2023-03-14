/*
Vehicles can be classified according to what energy source powers them. The program you are given has 3 vehicle classes: Vehicle, ElectricVehicle and HybridVehicle.
ElectricVehicle and HybridVehicle classes are inherited from Vehicle class.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();

        vehicle.start();
        vehicle.resource();
        electric.start();
        electric.resource();
        hybrid.start();
        hybrid.resource();

    }
}

class Vehicle{
    public void start(){
        System.out.println("Staring");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}
class ElectricVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use electricity");
    }
}
class HybridVehicle extends Vehicle{
    public void resource(){
        System.out.println("i use both petrol and electricity");
    }
}