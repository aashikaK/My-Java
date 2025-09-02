public class ternary {
    public static void main(String[] args) {
        int a=10,b=20,MAX;
        MAX=(a>b)? a : b ;
        System.out.println(MAX);

        int c=30;
        MAX= (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(MAX);
    }
}
