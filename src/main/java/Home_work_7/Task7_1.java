package Home_work_7;//1. Create method to check:
//if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception


public class Task7_1 {
    public static void main(String[] args) {
            compare(0);

    }

    private static void compare(int number) {
        number = 0;
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0)
            System.out.println("Number > 0");
        else if (number == 0){
            throw new MyException("My exception");
        }
    }
}

class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }
}


