import java.util.Scanner;
public class arithmetic{
    public static void main(String[] args){
        int a, b;
        System.out.println("Enter any two numbers: ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition= "+(a+b));
        System.out.println("Subtraction= "+(a-b));
        System.out.println("Product= "+(a*b));
        System.out.println("Division= "+(a/b));
        System.out.println("Remainder= "+(a%b));
        sc.close();
    }
}