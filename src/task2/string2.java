package task2;

import java.util.Scanner;

// Является ли строка идентификатором
public class string2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = in.nextLine();
//        boolean isValidIdentifier = str.matches("^[_A-Za-z]+[_A-Za-z0-9]+$");
        if (isValidIdentifier(str)) {
            System.out.println("«" + str + "» - is identifier");
        } else {
            System.out.println("«" + str + "» - is NOT identifier");
        }
    }

    private static boolean isValidIdentifier(String string) {
        if (!('a' <= string.toLowerCase().charAt(0) && string.toLowerCase().charAt(0) <= 'z' || string.charAt(0) == '_')) {
            return false;
        } else for (int i = 1; i < string.length(); i++) {
            if (!('a' <= string.toLowerCase().charAt(i) && string.toLowerCase().charAt(i) <= 'z'
                    || string.charAt(0) == '_'
                    || string.charAt(0) > 47 && string.charAt(0) < 58)) {
                return false;
            }
        }
        return true;
    }
}