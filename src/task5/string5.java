package task5;

import java.util.Scanner;

// Удаление из строки повторяющихся символов и всех пробелов
public class string5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = in.nextLine();
        str = str.replaceAll(" ", "");
        String result = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result = result.concat(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(result);
    }
}