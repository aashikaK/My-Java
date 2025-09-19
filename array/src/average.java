public class average {
    public static void main(String[] args) {
        int a[]={10,20,30,50,40},sum=0;

        System.out.println("Elements of array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            sum+= a[i];
        }
        float average=(float)sum/a.length;
        System.out.println("\nverage of the array elements is: "+average);
    }
    
}
