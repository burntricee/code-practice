package CodeForces.AntonDanik;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.next();
        String outcomes = input.next();
        int ADubs = 0;
        int DDubs = 0;
        for (char i : outcomes.toCharArray()){
            if (i == 'A') {
                ADubs++;
            } else {
                DDubs++;
            }
        }
        if (ADubs > DDubs) {
            System.out.println("Anton");
        } else if (ADubs < DDubs) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
