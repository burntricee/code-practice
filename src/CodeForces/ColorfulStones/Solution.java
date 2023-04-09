package CodeForces.ColorfulStones;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next(), t = input.next();
        int p = 0;
        for (char i : t.toCharArray()) if (i == s.charAt(p)) p++;
        System.out.println(p + 1);
    }
}