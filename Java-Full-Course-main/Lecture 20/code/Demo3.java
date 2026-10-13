// BufferedReader

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
       // InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        System.out.println(name);
    }
}

/*
1. Aditya -> i/p
2. OS BUffer (65, 100, 105, 116, 121, 97)
3. System.in (InputStream) recieves bytes
4. INputStreamReader --> stream of bytes into stream of characters
    ('A', 'd', 'i', 't', 'y', 'a')
5. BufferedReader --> readLine --> Aditya --> name
6. Aditya -> o/p
*/
