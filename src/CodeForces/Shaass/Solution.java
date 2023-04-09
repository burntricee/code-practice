package CodeForces.Shaass;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] b = new int[n];
        LinkedList<Pair<Integer, Integer>> s = new LinkedList<>();
        for (int i = 0; i < n; i++) b[i] = input.nextInt();
        for (int i = 0; i < m; i++) s.add(new Pair<>(input.nextInt() - 1, input.nextInt() - 1));
        for (Pair<Integer, Integer> l : s) {
            if (l.getKey() != 0) b[l.getKey() - 1] += l.getValue();
            if (l.getKey() != n - 1) b[l.getKey() + 1] += b[l.getKey()] - l.getValue() - 1;
            b[l.getKey()] = 0;
        }
        for (int i : b) System.out.println(i);
    }
}