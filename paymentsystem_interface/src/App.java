public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
interface Payment{
    void pay(double amt);
 }
class Esewa implements Payment{
    public void pay(double amt){
        System.out.println("User payed Rs."+amt+" using Esewa");
    }
}
class Khalti implements Payment{
    public void pay(double amt){
        System.out.println("User payed Rs."+amt+" using Khalti");
    }
}
class Cash implements Payment{
    public void pay(double amt){
        System.out.println("User payed Rs."+amt+" using Khalti");
    }
}