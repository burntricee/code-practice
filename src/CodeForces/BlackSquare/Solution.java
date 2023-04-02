package CodeForces.BlackSquare;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] c = new int[5];
        for (int i = 1; i < 5; i++) c[i] = input.nextInt();
        int o = 0;
        for (char s : input.next().toCharArray()) o += c[s - '0'];
        System.out.println(o);
    }
}
