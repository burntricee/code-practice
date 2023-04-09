package CodeForces.AntonLetters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> s = new HashSet<>();
        for (char i : input.nextLine().toCharArray()) if (Character.isLetter(i)) s.add(i);
        System.out.println(s.size());
    }
}
