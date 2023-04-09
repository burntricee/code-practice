package CodeForces.Games;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), o = 0;
        int[][] c = new int[n][2];
        for (int i = 0; i < n; i++) {
            c[i][0] = input.nextInt();
            c[i][1] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int u = 0, d = n - 1;
            while (u != i) if (c[i][0] == c[u++][1]) o++;
            while (d != i) if (c[i][0] == c[d--][1]) o++;
        }
        System.out.println(o);
    }
}