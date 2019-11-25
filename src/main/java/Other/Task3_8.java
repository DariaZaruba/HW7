package Other;//8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.

import java.util.ArrayList;

public class Task3_8 {

        private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
            transformIntToChar(5);
            //printList(ArrayList<>);
        // write your code here
    }

}
