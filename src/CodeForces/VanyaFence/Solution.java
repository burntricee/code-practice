package CodeForces.VanyaFence;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numFriends = input.nextInt(), fenceHeight = input.nextInt();
        int height, width = 0;
        for (int i = 0; i < numFriends; i++) {
            height = input.nextInt();
            if (height > fenceHeight) {
                width += 2;
            } else {
                width++;
            }
        }
        System.out.println(width);
    }
}
