package CodeForces.PetyaStrings;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int compare = input.nextLine().compareToIgnoreCase(input.nextLine());
        if (compare == 0) {
            System.out.println(0);
        } else {
            System.out.println(compare / Math.abs(compare));
        }
    }
}
