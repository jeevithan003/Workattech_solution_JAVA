// Given a two-digit number n, print both the digits of the number.

// Input Format
// The first line indicating the number of test cases T.

// Next T lines will each contain a single number ni.

// Output Format
// T lines each containing two digits of the number ni separated by space.

// Examples
// Sample Input
// 2
// 34
// 45
// Expected Output
// 3 4
// 4 5

import java.util.Scanner;

class WorkAtTech {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of integers to process
        int a = sc.nextInt();
        
        for (int z = 0; z < a; z++) {
            int res = sc.nextInt();
            String x = Integer.toString(res);
            
            // Print the first digit
            System.out.print(x.charAt(0) + " ");
            
            // Check if there is a second digit and print it
            if (x.length() > 1) {
                System.out.print(x.charAt(1));
            }
            // Move to the next line after printing digits
            System.out.println();
        }
        
        // Close the scanner
        sc.close();
    }
}

