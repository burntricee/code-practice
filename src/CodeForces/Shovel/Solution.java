package CodeForces.Shovel;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt(), r = input.nextInt(), c = 1;
        while (k * c % 10 != 0 && (k * c % 10) - r != 0) c++;
        System.out.println(c);
    }
}