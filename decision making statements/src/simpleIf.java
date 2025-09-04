import java.util.Scanner;
class simpleIf{
    public static void main(String[] args){
        int age;
        System.out.println("Please enter your age: ");
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();
        if(age<18){
            System.out.println("You are not elligible to vote. You must be above 18 years old. ");
        }
        System.out.println("Thank You!!");
        sc.close();
    }
}