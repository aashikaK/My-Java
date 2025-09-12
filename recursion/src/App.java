public class App {
    public static void main(String[] args) throws Exception {
        App obj= new App();
        int Sum=obj.sum(5);
        System.out.println("Sum of first N natural number: " +Sum );
    }
    int sum(int b){
        if(b>0)
        return b+ sum(b-1);

        else
        return 0;
    }
}
