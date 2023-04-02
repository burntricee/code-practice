package CodeForces.BearBigBrother;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weightLimak = input.nextInt();
        int weightBob = input.nextInt();
        int years = 0;
        while (weightLimak <= weightBob){
            weightLimak *= 3;
            weightBob *= 2;
            years++;
        }
        System.out.println(years);
    }
}
