// You and your friend decide to play a game where given some numbers, you have to find the maximum number. If the maximum is an even number, you win and if it is odd, your friend wins.

// Input Format
// Two lines:

// First line contains a single integer N
// Second line contains N space separated integers
// N
// n1 n2 n3 ..... nN
// Output Format
// Your winning status. If you win, print WON and if you lose, print LOST.

// Examples
// Sample Input
// 5
// 12 45 234 5674 122
// Expected Output
// WON

import java.util.Scanner;

class WorkAtTech {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int a = sc.nextInt();
        int[] x = new int[a];
        
        // Read the elements into the array
        for (int i = 0; i < a; i++) { // Changed <= to <
            x[i] = sc.nextInt();
        }
        
        // Find the maximum value in the array
        int max = x[0];
        for (int g = 1; g < x.length; g++) { // Changed <= to <
            if (max < x[g]) {
                max = x[g];
            }
        }
        
        // Determine if the maximum value is even or odd
        if (max % 2 == 0) {
            System.out.println("WON");
        } else {
            System.out.println("LOST");
        }
        
        sc.close(); // Close the scanner
    }
}
