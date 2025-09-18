import java.util.Scanner;

public class arrayDynamic {
    public static void main(String[] args) {
        int size,i;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        size= sc.nextInt();
        int a[]= new int[size];
        for(i=0;i<size;i++){
        System.out.println("Enter element "+(i+1));
        a[i]=sc.nextInt();          
        sc.close();
        }    
        System.out.println("Array elements: ");
        for(i=0;i<size;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
