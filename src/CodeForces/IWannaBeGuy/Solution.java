package CodeForces.IWannaBeGuy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> levels = new HashSet<>();
        int n = input.nextInt();
        int p = input.nextInt();
        for (int i = 0; i < p; i++) levels.add(input.nextInt());
        int q = input.nextInt();
        for (int i = 0; i < q; i++) levels.add(input.nextInt());
        if (levels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}