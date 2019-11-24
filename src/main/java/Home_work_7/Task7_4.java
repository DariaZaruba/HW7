package Home_work_7;//4. Fix the program to make it work

public class Task7_4 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = getNumber(a);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            e.printStackTrace();
        }
//        catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
    }

    private static int getNumber(int a) throws ArithmeticException {
        return 4 / a;
    }

}

