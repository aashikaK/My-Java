public class App {
    public static void main(String[] args) throws Exception {
        Car c= new Car();
        c.start();
        c.stop();
        Bike b= new Bike();
        b.start();
        b.stop();
    }
}

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts with a key.");
    }
    public void stop(){
        System.out.println("Car stops with a brake.");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts with a kick.");
    }
    public void stop(){
        System.out.println("Bike stops with a hand/foot brake.");
    }
}