package task6;

import java.util.Scanner;

// Замена подстроки
public class string6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String string = in.nextLine();
        System.out.println("Input the replacement substring :");
        String substring = in.nextLine();
        System.out.println("Replaced by:");
        String replacement = in.nextLine();
        string = string.replaceAll(substring, replacement);
        System.out.println("Result:");
        System.out.println(string);
    }
}