package OOPS.Abstraction;

public abstract class Car {
    public abstract void accelerate(); // abstract method
    public abstract void breaking(); // abstract method
    public void honk(){
        System.out.println("Car is honking"); // concrete method
    }
}
