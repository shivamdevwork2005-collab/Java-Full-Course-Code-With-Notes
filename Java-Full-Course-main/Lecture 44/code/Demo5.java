import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo5 {
    public static void main(String[] args) {
       try {
         readFile();
       }
       catch(FileNotFoundException e) {

       }
    }

    private static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
    }
}

// Checked Exceptions --> throws
