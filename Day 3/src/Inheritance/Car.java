package Inheritance;

public class Car extends Vehicle {
    int gear;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
//5) Inheritance.Vehicle
// Create a base class of a Inheritance.Vehicle,
// then create a Inheritance.Car class which inherits from the Inheritance.Vehicle class.
// Also, create another class, a specific type of Inheritance.Car that inherits from the Inheritance.Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.