import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n(not more than 10): ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        while(n>=0){
            System.out.println("Learn Java");
            n-=1;
        }
        sc.close();
    }
    
}
