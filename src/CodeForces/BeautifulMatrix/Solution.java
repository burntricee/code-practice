package CodeForces.BeautifulMatrix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] coords = findI();
        int moves = 0;
        for (int i = 0; i < 2; i++) {
            if (coords[i] != 2) moves += Math.abs(coords[i] - 2);
        }
        System.out.println(moves);
    }

    public static int[] findI() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (input.nextInt() == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
