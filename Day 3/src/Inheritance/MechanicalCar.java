package Inheritance;

public class MechanicalCar extends Car {
    public static void main (String[] args){
        Car car1 = new MechanicalCar();
        car1.setSpeed(100);
        car1.increaseSpeed(50);
        car1.setGear(6);
    }

}