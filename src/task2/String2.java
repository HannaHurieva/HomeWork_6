package task2;

import java.util.Scanner;

// Является ли строка идентификатором
public class String2 {
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
        char[] strToArray = string.toLowerCase().toCharArray();
        if (!('a' <= strToArray[0] && strToArray[0] <= 'z' || strToArray[0] == '_')) {
            return false;
        } else for (int i = 1; i < string.length(); i++) {
            if (!('a' <= strToArray[i] && strToArray[i]  <= 'z'
                    || strToArray[i]  == '_'
                    || strToArray[i]  > 47 && strToArray[i]  < 58)) {
                return false;
            }
        }
        return true;
    }
}