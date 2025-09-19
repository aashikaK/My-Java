import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Array elements: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++){
            sum +=a[i];
        }
        
        System.out.print("\nSum of the array elements: "+sum);
        
    sc.close();
    }
}
