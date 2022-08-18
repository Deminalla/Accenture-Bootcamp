package Inheritance;

public class MechanicalCar extends Car {
    public static void main (String[] args){
        Car car1 = new MechanicalCar();
        car1.setSpeed(100);
        car1.increaseSpeed(50);
        car1.setGear(6);
    }

}
//5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.