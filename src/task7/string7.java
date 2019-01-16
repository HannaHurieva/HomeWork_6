package task7;

import java.util.Scanner;

// Самая длинная строка в массиве
public class string7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of strings :");
        int numberOfStrings = in.nextInt();
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Input the string " + i + " :");
            strings[i] = in.next();
        }
        int index = 0;
        for (int i = 0; i < numberOfStrings - 1; i++) {
            if (strings[i].length() < strings[i + 1].length()) {
                index = i + 1;
            }
        }
        System.out.println("Indexes of longest lines : ");
        for (int i = 0; i < numberOfStrings; i++) {
            if (strings[index].length() == strings[i].length()) {
                System.out.println(i);
            }
        }
    }
}