 class Vehicle{
    private int numberplate;
    void speed(){
        System.out.println("Normal Vehicle' are  move with 40 kpm");
    }
    void setnumberplate (int number){
        numberplate=number;  
    }
    int getnumberplate(){
        return numberplate;
    }
}

 class Car extends Vehicle{
    void speed(){
        System.out.println("The ferrari Car can move with top speed 100 kpm ");
    }
}
class Bike extends Vehicle{
    void speed(){
        System.out.println("The Ninja h2r bike top speed is 200");
    }
}
public class InnerVehicle {
    public static void main(String[] args){
        Vehicle vehicle;

        vehicle= new Bike();
        vehicle.speed();

        vehicle= new Car();
        vehicle.speed();

        Vehicle v1 =new Vehicle();
        v1.setnumberplate(1810);
        System.out.println(v1.getnumberplate());


        
    }

    
}
