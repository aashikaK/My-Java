public class App {
    double withdraw=6000;
    double total_balance=25000;
    public static void main(String[] args) throws Exception {
        if(withdraw>total_balance){
            throw new InsufficientBalanceException("Insufficient Balance!")
        }
    }
}
class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        super(msg);
            }
}