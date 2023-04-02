package CodeForces.GravityFlip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> cubesPerColumn = new ArrayList<>();
        int numColumns = input.nextInt();
        for (int i = 0; i < numColumns; i++) cubesPerColumn.add(input.nextInt());
        Collections.sort(cubesPerColumn);
        for (int i : cubesPerColumn) System.out.print(i + " ");
    }
}
