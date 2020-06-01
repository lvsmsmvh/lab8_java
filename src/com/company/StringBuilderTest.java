package com.company;

import java.util.Scanner;

public class  StringBuilderTest {
    static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a char/digit sequence :");
        StringBuilder string = new StringBuilder();
        string.insert(0, scanner.next());

        StringBuilder longestNumbers = new StringBuilder();
        StringBuilder newLongestNumbers = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);

            if (Character.isDigit(a)) {
                newLongestNumbers.append(a);
            } else {
                newLongestNumbers.setLength(0);
            }

            if (newLongestNumbers.length() > longestNumbers.length()) {
                longestNumbers.setLength(0);
                longestNumbers.insert(0, newLongestNumbers.toString());
            }
        }
        System.out.println(longestNumbers);
    }
}
