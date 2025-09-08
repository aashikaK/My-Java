import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        int a=20,b=5,ch;
        System.out.println("Enter user choice..!\n1 for sum\n2 for difference\n3 for product\n4 for division.");
        Scanner sc= new Scanner(System.in);
        ch= sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("Sum= "+(a+b)); 
            break;
            case 2:
            System.out.println("Difference= "+(a-b)); 
            break;
            case 3:
            System.out.println("Product= "+(a*b)); 
            break;
            case 4:
            try{
            System.out.println("Division= "+((float)a/b)); }
            catch(Exception e){ System.out.println("Error-> " +e.getMessage());}
            break;
            default:
            System.out.println("You entered invalid choice.");
        }
        sc.close();
    }
    
}
