public class App {
    public static void main(String[] args) throws Exception {
        Payment p;
        p= new Esewa();
        p.pay(500);
        p=new Khalti();
        p.pay(7000);
        p=new Cash();
        p.pay(20000);
    }
}
interface Payment{
    void pay(double amt);
 }
class Esewa implements Payment{
    public void pay(double amt){
        System.out.println("User payed Rs."+amt+" using Esewa.");
    }
}
class Khalti implements Payment{
    public void pay(double amt){
        System.out.println("User payed Rs."+amt+" using Khalti.");
    }
}
class Cash implements Payment{
    public void pay(double amt){
        System.out.println("User payed Rs."+amt+" in cash.");
    }
}