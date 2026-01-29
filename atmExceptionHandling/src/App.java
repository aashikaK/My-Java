public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class ATM {
    int balance=10000;
    void withdrawl(int amount) extends InsufficientBalanceException{

        if (amount<=0){
            throw new IllegalArgumentException();
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
    }
}