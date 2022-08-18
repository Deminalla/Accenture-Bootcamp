package Inheritance;

public class MechanicalCar extends Car {
    public static void main (String[] args){
        Car car1 = new MechanicalCar();
        System.out.println(car1.getSpeed());
        car1.increaseSpeed(50);
        car1.setModel("Volvo");
        car1.setGear(5);
    }
}