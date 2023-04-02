package CodeForces.Snacktower;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int greatest = num;
        Integer[] snacks = new Integer[num];
        for (int i = 0; i < num; i++) snacks[i] = input.nextInt(); // adds snack sizes
        Set<Integer> dropped = new TreeSet<>();
        for (int i = 0; i < num; i++) { // for each snack dropping
            if (snacks[i] != greatest) {
                System.out.println();
                dropped.add(snacks[i]);
            } else {
                System.out.print(greatest + " ");
                greatest--;
                while (dropped.contains(greatest)) {
                    System.out.print(greatest + " ");
                    greatest--;
                }
                System.out.println();
            }
        }
    }
}
