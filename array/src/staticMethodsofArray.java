import java.util.Arrays;

public class staticMethodsofArray {
    public static void main(String[] args) {
        String a[]={"Have","a","good","Day."};
        System.out.println("toString(): "+Arrays.toString(a));
        System.out.println("asList(): "+Arrays.asList(a));

        int arr[][]={{1,30},{4,56}};
        System.out.println("deepToString(): "+Arrays.deepToString(arr));
    }
}
