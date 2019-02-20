package task11;

import java.util.Scanner;

// Количество слов в строке
public class String11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String string = in.nextLine();
        String[] words = string.split("\\s");
        System.out.println("The number of worlds in string = " + words.length);
    }
}
