package CodeForces.Watermelon;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        if (weight % 2 != 0 || weight <= 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
