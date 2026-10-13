public class Demo2 {
    public static void main(String[] args) {
        
        String s1 = new String("Aditya");
        String s2 = new String("abc");
        
        // Length/ Emptiness
        // System.out.println(s1.length()); // 5
        // System.out.println(s1.isEmpty()); // false
        // System.out.println(s1.isBlank()); // true

        // Character access
       // System.out.println(s1.charAt(2));
        //char[] arr = s1.toCharArray(); // {'a', 'd', 'i', 't', 'y', 'a'}

        // Comparison
        // System.out.println(s1.equals(s2));  // false
        // System.out.println(s1.equalsIgnoreCase(s2)); // true

        // Lexicographical comparison --> Dictionary
        //System.out.println(s1.compareTo(s2));

        // Searching
        // System.out.println(s1.contains("ity"));  // true
        // System.out.println(s1.indexOf("ity")); // 2
        // System.out.println(s1.lastIndexOf("ity")); // 6

        // System.out.println(s1.startsWith("Ad"));

        // Extractioon / transformation
        //System.out.println(s1.substring(1));

        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.trim());
        // System.out.println(s1.strip());  // uniocode friendly

        //System.out.println(s1.repeat(3));
        // System.out.println(s1.replace("ity", "abc"));
        // System.out.println(s1.replaceAll("ad", "ab"));

        // String s3 = "Aditya-Rohit-Rohan";
        // String[] arr = s3.split("-");

        // for(String s : arr) {
        //     System.out.println(s);
        // }

        // System.out.println(String.join("-", "a", "b", "c")); // a-b-c

        // // Conversion 
        // String s4 = new String(String.valueOf(10));

        // byte[] arr = s1.getBytes();
        // for(byte i : arr) {
        //     System.out.print(i + " , ");
        // }

        // Advance --> intern(), format()
        // String s5 = new String("Hello");
        // String s6 = s5.intern();

        // System.out.println(s5 == s6);

        // format
        String name = "Aditya";
        int age = 28;

        // Hello Aditya, your age is 28;

        System.out.println("Hello" + " " + name + "," + " " + "your age is" + " " + age);
        System.out.println(String.format("Hello %s, your age is %s", name, age));
        
    }
}

// equals() --> == --> References compare
// compareTo() --> -ve, 0 +ve

// substring --> [, )

/*
String pool : "Hello" <-- s6
Heap: s5 --> "Hello" 
Heap: 
*/

