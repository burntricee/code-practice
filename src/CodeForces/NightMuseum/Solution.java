package CodeForces.NightMuseum;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] n = input.next().toCharArray();
        char p = 'a';
        int m = 0;
        for (char i : n) {
            int d = Math.abs(i - p);
            m += Math.min(d, 26 - d);
            p = i;
        }
        System.out.println(m);
    }
}
