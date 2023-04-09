package CodeForces.DieRoll;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] d = {"1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};
        int r = Math.max(input.nextInt(), input.nextInt());
        System.out.println(d[6-r]);
    }
}