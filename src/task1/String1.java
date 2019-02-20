package task1;

import java.util.Scanner;

// Составить из букв введенной строки слова
public class String1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = in.nextLine();
        System.out.println("Input  the number of words to make :");
        int count = in.nextInt();

        for (int i = 1; i < count; i++) {
            int lehgthOfString = str.length();
            int lehgthOfWord = (int) (Math.random() * 8 + 2);
            String word = "" ;
            int lehgth = 0;
            while (lehgth <= lehgthOfWord) {
                int index = (int) (Math.random() * lehgthOfString);
                if (!(str.charAt(index) == ' ')) {
                    word += String.valueOf(str.charAt(index));
                    lehgth++;
                }
            }
            System.out.println(word);
        }
    }
}