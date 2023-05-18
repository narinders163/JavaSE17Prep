package Abstraction;

public class ExtendingCars extends Car {
    public void drive() {
        System.out.println("Driveable");
    }
    public void music() {
        System.out.println("Music system");
    }
    public void engine() {
        System.out.println("v6 engine");
    }

    public static void main(String[] args) {
        Car c = new ExtendingCars();
        c.hatch();

        ExtendingCars e = new ExtendingCars(){
           public void music(){
               System.out.println("Very loud music");
           }
        };
        e.music();
    }
}
