import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        factorial obj= new factorial();
        int factorial= obj.fact(num);
        System.out.println("Factorial of "+num+" is: "+factorial);
        sc.close();
    }
    int fact(int n){
        if (n==1 || n==0)
        return 1;
        else

        return fact(n-1)*n;
    }
}
