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