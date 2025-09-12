import java.util.Scanner;

public class learn_method {
    int n1,n2,sum,sub,multi,div,rem;
    public static void main(String[] args) {
        learn_method obj= new learn_method();
        obj.input();
        obj.process();
        obj.output();
    }
    void input(){
        System.out.print("Enter the value two numbers: ");
        Scanner sc= new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        sc.close(); 
    }
    void process(){
        sum=n1+n2;
        sub=n1-n2;
        multi=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }
    void output(){
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+sub);
        System.out.println("Product: "+multi);
        System.out.println("Division: "+div);
        System.out.println("Remainder: "+rem);   
    }
}
