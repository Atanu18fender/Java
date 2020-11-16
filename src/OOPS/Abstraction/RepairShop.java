package OOPS.Abstraction;

public class RepairShop {
    public static void RepairCar(Car car){
        System.out.println("Car is repaired");
    }

    public static void main(String[] args){
        Audi A4 =new Audi();
        WagonR w2=new WagonR();
        w2.honk();
        RepairCar(A4);
        RepairCar(w2);
    }
}
