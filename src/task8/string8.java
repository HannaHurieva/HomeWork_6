package task8;

import java.util.Scanner;

// Самое длинное слово в строке
public class string8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String string = in.nextLine();
        String[] arrayOfWords = string.split(" ");
        String longest = arrayOfWords[0];
        for (String word : arrayOfWords) {
            if (longest.length() < word.length()) {
                longest = word;
            }
        }
        System.out.println("The longest word of string : " + longest);
    }
}
