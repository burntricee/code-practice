package CodeForces.PoliceRecruits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int crimes = 0, police = 0;
        for (int i = 0; i < num; i++) {
            int event = input.nextInt();
            if (event == -1) { // if crime
                if (police == 0){ // if no police, increment crimes
                    crimes++;
                } else { // if there's police, reduce by 1
                    police--;
                }
            } else { // if not crime, add police
                police += event;
            }
        }
        System.out.println(crimes); // print out the crimes
    }
}
