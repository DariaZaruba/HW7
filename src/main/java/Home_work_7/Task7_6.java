package Home_work_7;
//6.      Write a program that will enter numbers from the keyboard.
//        The code for reading numbers from the keyboard must be in the readData method.
//        The code inside the readData is wrapped in a try..catch.
//        If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
//        Numbers output from a new line preserving the order of input."

    import java.util.*;
    import java.util.stream.Stream;

public class Task7_6 {
    public static void main(String[] args) {
        readData();
    }
     public static void readData() {
         List<Integer> numbers = new ArrayList<>();
         try {
             while (true) {
                 Scanner reader = new Scanner(System.in);
                 System.out.print("Enter a number: ");
                 numbers.add(reader.nextInt());
             }
         } catch (Exception c) {
             c.printStackTrace();
             System.out.println("Previous numbers: " + numbers);
         }
     }
 }


//    public static void readData() {
//        Integer[] arrayNumbers = new Integer[4];
//        int i;
//        try {
//            for (i = 0; i < arrayNumbers.length; i++) {
//                Scanner reader = new Scanner(System.in);
//                System.out.print("Enter a number: ");
//                // nextInt() reads the next integer from the keyboard
//                arrayNumbers[i] = reader.nextInt();
//            }
//        } catch (Exception c) {
//            c.printStackTrace();
//            System.out.println("Previous numbers: " + Arrays.toString(Stream.of(arrayNumbers).filter(Objects::nonNull).toArray()));
//        }
//    }
//}


