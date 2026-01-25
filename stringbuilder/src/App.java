public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder sb= new StringBuilder("Hello");
       
        sb.append(" Aashika"); //adds
        System.out.println(sb);

        sb.replace(0,5,"Hi"); //replaces from 0 to 4
        System.out.println(sb);

        sb.append(" Friend");
        System.out.println(sb);

        sb.delete(10,17);
        System.out.println(sb);

        sb.insert(3,"Miss.");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
