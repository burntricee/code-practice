package CodeForces.Magnets;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(), groups = 1;
        int[] magnets = new int[num];
        for (int i = 0; i < num; i++) magnets[i] = input.nextInt();
        for (int i = 0; i < num - 1; i++) if (magnets[i] != magnets[i + 1]) groups++;
        System.out.println(groups);
    }
}
