package CodeForces.Dragons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt(), n = input.nextInt();
        ArrayList<int[]> d = new ArrayList<>();
        for (int i = 0; i < n; i++) d.add(new int[]{input.nextInt(), input.nextInt()});
        d.sort(Comparator.comparingInt(o -> o[0]));
        p(s, n, d);
    }

    private static void p(int s, int n, ArrayList<int[]> d) {
        for (int i = 0; i < n; i++) {
            if (s > d.get(i)[0]) {
                s += d.get(i)[1];
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}