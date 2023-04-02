package CodeForces.SerejaDima;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int serjaPoints = 0, dimaPoints = 0;
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < size; i++) cards.add(input.nextInt());
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                serjaPoints += cards.get(0) > cards.get(cards.size()-1) ? cards.remove(0) : cards.remove(cards.size()-1);
            } else {
                dimaPoints += cards.get(0) > cards.get(cards.size()-1) ? cards.remove(0) : cards.remove(cards.size()-1);
            }
        }
        System.out.println(serjaPoints + " " + dimaPoints);
    }
}
