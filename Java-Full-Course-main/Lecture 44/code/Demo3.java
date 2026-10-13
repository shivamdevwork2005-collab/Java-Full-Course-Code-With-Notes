public class Demo3 {
    public static void main(String[] args) {
        try {
            //System.out.println( 5 / 0); // new ArithmeticException("/ by zero");
            String s = null;
            s.length();

            Object obj = "Hello";
            Integer i = (Integer) obj; // new ClassCastException()
        }
        catch(ArithmeticException | NullPointerException e) { // this is never recommended
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e) {
            
        }
        catch(Exception e) {
            System.out.println("Some generice Exception");
        }
    }
}
