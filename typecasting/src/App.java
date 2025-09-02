public class App {
    public static void main(String[] args) throws Exception {
        int a= 10;
        double b = a; //implicit typecasting, a is stored in double b (int changed to double)
        System.out.println(b);

        double c= 10.5;
        int d= (int)c;  //explicit type casting cause changing larger to smaller datatype is not done by the compiler
        System.out.println(d);
    }
}
