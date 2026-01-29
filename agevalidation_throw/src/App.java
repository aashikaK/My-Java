public class App {
    static double withdraw=60000;
    static double total_balance=25000;
    public static void main(String[] args) throws Exception {
        if(withdraw>total_balance){
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        System.out.println("Withdrawl sucessful.");
    }
}
class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        super(msg);
            }
}