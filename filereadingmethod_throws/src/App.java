public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
import java.io.*;

class ThrowsHardExample {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt");
        fr.read();
    }

    static void processFile() throws IOException {
        readFile();
    }

    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("File problem handled");
        }
    }
}
