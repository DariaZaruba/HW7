package Home_work_7;//5. Throw a NullPointerException from the method iCanThrowException();
//iCanThrowException();
//        Handle it in the main method.


public class Task7_5 {

        public static void main(String[] args) {
            try {
                iCanThrowException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void iCanThrowException() {
           throw new NullPointerException();
        }

    }
