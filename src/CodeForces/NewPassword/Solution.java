package CodeForces.NewPassword;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int n = input.nextInt(), k = input.nextInt(), index = 0;
        for (int i = 0; i < n; i++) System.out.print(alphabet[index++ % k]);
    }
}
