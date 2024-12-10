// Simple Interest
// Beginner
// 10 / 10
// Your father has given you some money and you are trying to decide what you want to do with that money. Your friend gives you the idea of an investment that gives you simple interest for your money.

// If you invest a sum of p for t years at a rate of r%, the formula for simple interest will be -

// Interest = (p*r*t)/100

// Given the rate of interest and the time you can invest for, calculate the interest you will recieve.

// Input Format
// A single line with 3 space-separated parameters: Principal, Rate, Time

// Output Format
// Interest

// The value should be accurate upto exactly 6 decimal places.

// Examples
// Sample Input 1
// 1500 1.4 3
// Expected Output
// 63.000000
// Sample Input 2
// 2532.4 6.33 3.67
// Expected Output
// 588.304376


import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
		
		
	{
		Scanner sc= new Scanner(System.in);
		double  p,r,t=0;
		p=sc.nextDouble();
		r=sc.nextDouble();
		t=sc.nextDouble();
		double res= (p*r*t)/100;
		
		System.out.printf("%.6f",res);
		
	}
}
