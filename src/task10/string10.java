package task10;

import java.util.Scanner;

// Количество строчных и прописных букв в строке
public class string10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String string = in.nextLine();
        int lowerCase =0, upperCase =0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)>='a' && string.charAt(i) <='z'){
                lowerCase++;
            }
            if (string.charAt(i)>='A' && string.charAt(i) <='Z'){
                upperCase++;
            }
        }
        System.out.printf("Всего %d заглавных букв и %d прописных.",upperCase,lowerCase);
    }
}