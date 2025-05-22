class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine is starting.~~.");
    }

    void fuelType() {
        System.out.println("Vehicle uses generic fuel.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a keyless push button.");
    }

    @Override
    void fuelType() {
        System.out.println("It uses petrol.");
    }

    void numberOfDoors() {
        System.out.println("It has 4 doors.");
    }
}


public class OOP {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car(); 

        System.out.println("--- Vehicle Actions ---");
        myVehicle.startEngine();
        myVehicle.fuelType();

        System.out.println("\n -> Car Actions (via Vehicle reference) <-");
        myCar.startEngine();  
        myCar.fuelType();     

        
        if (myCar instanceof Car car) {
            car.numberOfDoors();
        }
    }
}
