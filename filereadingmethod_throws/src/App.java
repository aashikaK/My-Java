import java.io.*;

public class App {
    
    static void readFile() throws IOException{
        FileReader fr = new FileReader("text.txt");
    //    System.out.println(fr.read()); 
    //    System.out.println((char)fr.read()); 
       int ch;
       while((ch=fr.read())!=-1){
        System.out.print((char)ch);
       }
       fr.close();
    }
    static void processFile() throws IOException{
        readFile();
    }
    public static void main(String[] args) throws Exception {
        try{
            processFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
}
    }}
