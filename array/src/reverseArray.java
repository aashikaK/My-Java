// print array elements in reverse order

public class reverseArray {
    public static void main(String[] args) {
        int a[]={10,30,3,6,7,43,34};
        System.out.println("Elements of arrays: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nArray elements n reverse order: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
