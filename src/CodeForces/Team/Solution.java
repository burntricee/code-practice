package CodeForces.Team;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numProblems = input.nextInt();
        int problems = 0;
        for (int i = 0; i < numProblems; i++){
            int isSure = 0;
            for (int j = 0; j < 3; j++) isSure += input.nextInt();
            if (isSure >= 2) problems++;
        }
        System.out.println(problems);
    }
}
