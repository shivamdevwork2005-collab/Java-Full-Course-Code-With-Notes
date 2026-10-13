import java.util.concurrent.atomic.AtomicReference;

public class Demo2 {
    public static void main(String[] args) {
        SeatBooking sb = new SeatBooking();
        
        Thread t1 = new Thread(() -> {
            boolean value = sb.bookSeat("Aditya");
            System.out.println("T1 says " + value);
        });

        Thread t2 = new Thread(() -> {
            boolean value = sb.bookSeat("Rohit");
            System.out.println("T2 says " + value);
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {}

        System.out.println(sb.seat);

   } 
}

class SeatBooking {
    //String seat = new String("EMPTY");
    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name) {
        String currentValue = seat.get();

        if(currentValue.equals("EMPTY") == false) {
            return false;
        }

        return seat.compareAndSet("EMPTY", name);

    }
}

// Compare and Set operation