package CodeForces.BoyGirl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> userName = new ArrayList<>();
        for (char i : input.nextLine().toCharArray()) userName.add(i);
        Collections.sort(userName);
        char c = userName.get(0);
        int diff = 1;
        for (int i = 1; i < userName.size(); i++) {
            if (userName.get(i) != c) {
                diff++;
                c = userName.get(i);
            }
        }
        if (diff % 2 == 1) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}