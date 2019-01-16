package task9;

import java.util.Scanner;

// Удаление лишних пробелов
public class string9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String string = in.nextLine();
        string = string.trim();
        string = string.replaceAll("[ ]{2,}"," ");
        System.out.println(string);
    }
}