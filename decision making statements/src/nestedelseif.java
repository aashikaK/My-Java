public class nestedelseif {
    public static void main(String[] args) {
        int a=10,b=20,c=50;
        if(a>b){
            if(a>c)
            System.out.println("a is the greatest. "+a);
            else
            System.out.println("c is the greatest. "+c);
        }
        else{
            if(b>c)
            System.out.println("b is the greatest. "+b);
            else
            System.out.println("c is the greatest. "+c);
        }
    }
    
}
