public class incr_decr {
    public static void main(String[] args) {
        int a=20;
        System.out.println(a);
        System.out.println("Pre/PostIncrement: ");
        System.out.println(++a);
        System.out.println(a++);   

        System.out.println("Pre/PostDecrement: ");
        System.out.println(--a);
        System.out.println(a--);   

        System.out.println("Final value of a: "+a);
    }
}
