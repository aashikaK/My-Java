import java.util.Scanner;

public class arrayLength {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter elements in array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nArray Length: "+a.length);
        sc.close();
    }
    
}
