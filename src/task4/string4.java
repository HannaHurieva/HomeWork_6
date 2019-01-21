package task4;

import java.util.Arrays;
import java.util.Scanner;

// Отфильтровать из строки числа
// example: дана строка "data 48 call 9 read13 blank0a", в массиве должны оказаться числа 48, 9, 13 и 0.
public class string4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = in.nextLine();
        String temp = "" ;
        boolean switcher = false;
        int index = 0;
        while (index < str.length()) {
            while (index < str.length() && str.charAt(index) > 47 && str.charAt(index) < 58) {
                if (switcher) {
                    temp = temp.concat(" ");
                    switcher = false;
                }
                temp = temp.concat(String.valueOf(str.charAt(index)));
                index++;
            }
            index++;
            switcher = true;
        }
        temp = temp.trim();
        String[] split = temp.split(" ");
        int[] number = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            number[i] = Integer.parseInt(split[i]);
        }
        System.out.println(Arrays.toString(number));
    }
}