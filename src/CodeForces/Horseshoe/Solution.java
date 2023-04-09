package CodeForces.Horseshoe;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 4; i++) s.add(input.nextInt());
        System.out.println(4 - s.size());
    }
}