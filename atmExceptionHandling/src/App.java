public class App {
    public static void main(String[] args) throws Exception {
        ATM obj= new ATM();
        obj.withdrawl(1100);
    }
}

class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class ATM {
    int balance=10000;
    void withdrawl(int amount) throws InsufficientBalanceException{

        if (amount<=0){
            throw new IllegalArgumentException();
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}