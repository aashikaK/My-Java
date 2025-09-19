import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int key= sc.nextInt();
         boolean found = false;
        //  int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Element("+key+") found at position "+(i+1));
                // count++;
                  found = true;
                break;
            }
            // if(count>0){
            // System.out.println("Element("+key+") found at position "+(i+1)+" for "+count+ " times");
            // }
        }
        if(found==false){
        System.out.println("Element not found.");
        }
        sc.close();
    }
}
