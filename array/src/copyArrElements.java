/*to copy one array elements to another:
both should have same size
both should be of same type */ 

public class copyArrElements {
    public static void main(String[] args) {
        
        int a[]={40,56,43,23,34};
        int b[]= new int[5];
        System.out.println("Elements of first array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nSecond array elements: ");
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
