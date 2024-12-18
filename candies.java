// You are having a get together at your house and your mother asks you to distribute candies equally amongst all your cousins. You want to determine if the number of candies given by your mother can be equally distributed or not.

// Input Format
// A single line with two space-separated integers representing the number of candies and the number of cousins repectively.

// Output Format
// Print "YES" if you can equally distribute the candies and "NO" if you cannot.

// Examples
// Sample Input 1
// 35 10
// Expected Output
// NO
// Explanation
// You can't distribute 25 candies equally among 10 cousins.

// Sample Input 2
// 42 7
// Expected Output
// YES
// Explanation
// Each cousin recieves 6 candies.
import java.util.Scanner;

class WorkAtTech {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the input values
        int candies = sc.nextInt();
        int cousins = sc.nextInt();
        
        // Check if candies can be evenly distributed among cousins
        if (candies % cousins == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
