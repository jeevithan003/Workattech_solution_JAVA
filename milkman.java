// Your mother has sent you to the milkman with a cylindrical bottle. You have to pay the milkman the price for the bottle full of milk at a rate of ₹40 per litre of milk. You are given the radius (r) and the height (h) of the bottle in centimetres. You can assume the value of π as 3.14.

// Formula for volume of cylinder:

// V=π r2h

// Also, 1 litre = 1000 cm3.

// Input Format
// 1 line containing two space separated integers - the radius and the height of the bottle (in centimetres).

// Output Format
// The amount you need to pay to the milkman in rupees, accurate upto exactly 2 decimal places.

// Examples
// Sample Input
// 5 24
// Expected Output
// 75.36


import java.util.Scanner;

class WorkAtTech {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read radius and height from input
        int radius = sc.nextInt();
        int height = sc.nextInt();
        
        // Close the scanner
        sc.close();
        
        // Calculate the volume of the cylinder (in cm³)
        double volume = 3.14 * radius * radius * height;
        
        // Convert volume from cm³ to litres (1 litre = 1000 cm³)
        double volumeInLitres = volume / 1000;
        
        // Calculate the total cost at ₹40 per litre
        double totalCost = volumeInLitres * 40;
        
        // Print the total cost formatted to 2 decimal places
        System.out.printf("%.2f\n", totalCost);
    }
}
