package Home_work_7;//3. Finish the program to handle all the possible exceptions
//Print the cause of the exception to the console.

public class Task7_3 {

    public static void main(String[] args) {

            int a = args.length;
            System.out.println(a);

        try {
            int b = 10 / a;
            System.out.println(b);
        } catch (Exception d) {
            System.out.println("Error: " + d.getMessage());
            d.printStackTrace();
        }
        try {
            int[] c = {1};
            System.out.println(c[1]);
        } catch (Exception e){
            System.out.println("Error:" + e.getMessage());
            e.printStackTrace();
        }


        }

    }









