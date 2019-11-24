package Home_work_7;//2. Fix the method with try-catch to get the correct result of division:

public class Task7_2 {

        public static void main(String[] args) {
            System.out.println(divideByZero());
        }

        public static int divideByZero() {
            int a = 5;
            int b = 0;
            try {
                return a / b;
            } catch (Exception c){
                c.printStackTrace();
                return 0;
            }
        }
    }
