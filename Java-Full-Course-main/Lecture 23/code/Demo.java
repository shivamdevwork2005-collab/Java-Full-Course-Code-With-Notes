public class Demo {
    public static void main(String[] args) {
        // int status = PaymentStatus.SUCCESS;

        // System.out.println(status);

        // int status2 = 100;

        // if(status == Role.ADMIN) {

        // }

        String status = PaymentStatus.SUCCESS;
        System.out.println(status);

        if(status == "success") {

        }
    }
}

// payment status --> success, failed, pending
// final

/*
Problems with this approach :
1. Type safety
2. Poor Readability
3. No Grouping od related enitites
*/

class PaymentStatus {
    public static final String SUCCESS = "Success";
    public static final String FAILED = "Failed";
    public static final String PENDING = "Pending";
}

class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 2;
}