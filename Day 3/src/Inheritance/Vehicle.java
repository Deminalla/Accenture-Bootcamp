package Inheritance;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class Vehicle {
    int speed;
    int distance;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void increaseSpeed (int amount){
        speed += amount;
    }

    public void decreaseSpeed (int amount){
        speed -= amount;
    }
}
//5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.