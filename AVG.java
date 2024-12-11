// Average Weight
// Beginner
// 10 / 10
// Your teacher has assigned you the task of finding out the average weight of your class. She gives you the weights of all the students in the class and expects you to calculate the average weight of the class. Assume that there are only 10 students in your class.

// Input Format
// A single line with 10 space separated weights

// w1 w2 w3 w4 w5 w6 w7 w8 w9 w10

// Output Format
// A single value - The average weight

// The value should be accurate upto exactly 6 decimal places.

// Examples
// Sample Input
// 40.75 45.2 55.3 49.5 43.3 54.1 38.4 63.8 45.2 58.25
// Expected Output
// 49.380000


  import java.util.Scanner;

class WorkAtTech {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double sum = 0;
        int count = 0;

        // Read numbers until there is no more input
        while (sc.hasNextDouble()) {
            double number = sc.nextDouble();
            sum += number;
            count++;
        }

        // Check if any numbers were provided
        if (count == 0) {
            System.out.println("No elements provided.");
        } else {
            // Calculate the average
            double average = sum / count;
            // Print the average with six decimal places
            System.out.printf("%.6f\n", average);
        }
        
        // Close the scanner
        sc.close();
    }
}
