package task3;

import java.util.Scanner;

// Удалить из строки пробелы и определить, является ли она перевертышем
// example: a roza upala na lapu azora
public class String3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = in.nextLine();
        String palindrome = str.replaceAll(" ", "");
        if (isPalindrome(palindrome)) {
            System.out.println("Your string is palindrome!");
        } else {
            System.out.println("Your string is not palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < (length / 2); i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}