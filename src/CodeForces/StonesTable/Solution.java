package CodeForces.StonesTable;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStones = input.nextInt(), remove = 0;
        char[] stones = input.next().toCharArray();
        for (int i = 0; i < numStones - 1; i++) if (stones[i] == stones[i + 1]) remove++;
        System.out.println(remove);
    }
}
