package CodeForces.CarrotCakes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), t = input.nextInt(), k = input.nextInt(), d = input.nextInt(), m = 0, c = 0;
        while (c < n) {
            m++;
            if (m > d && (m - d) % t == 0) c += k;
            if (m % t == 0) c += k;
        }
        if (m < Math.ceil((double) n / k) * t) System.out.println("YES");
        else System.out.println("NO");
    }
}