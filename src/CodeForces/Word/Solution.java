package CodeForces.Word;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int upperCase = 0;
        for (char i : word.toCharArray()) if (Character.isUpperCase(i)) upperCase++;
        word = 2 * upperCase > word.length() ? word.toUpperCase() : word.toLowerCase();
        System.out.println(word);
    }
}
