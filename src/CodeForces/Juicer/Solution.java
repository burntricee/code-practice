package CodeForces.Juicer;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), b = input.nextInt(), d = input.nextInt(), o = 0, c = 0;
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (s[i] > b) continue;
            o += s[i];
            if (o > d) {
                o = 0;
                c++;
            }
        }
        System.out.println(c);
    }
}