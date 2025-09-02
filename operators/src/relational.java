import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("less than: " +(a<b) );
        System.out.println("less than or equal to: " +(a<=b) );
        System.out.println("greater than: " +(a>b) );
        System.out.println("greater than or equal to: " +(a>=b) );
        System.out.println("equal to: " +(a==b) );
        System.out.println("not equal to: " +(a!=b) );
        sc.close();
    }
}
