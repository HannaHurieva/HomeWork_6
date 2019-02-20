package task9;

import java.util.Scanner;

// Удаление лишних пробелов
public class String9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String string = in.nextLine();
//        result = string.replaceAll("[ ]{2,}", " ");
        String result = "" ;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (!(string.charAt(i) == ' ')) {
                result = result.concat(String.valueOf(string.charAt(i)));
                count = 0;
            } else {
                count ++;
                if (count > 1) {
                    continue;
                } else {
                    result = result.concat(String.valueOf(string.charAt(i)));
                }
            }
        }
        System.out.println(result.trim());
    }
}