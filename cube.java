// Cube
// Beginner
// 10 / 10
// You have a cube with each edge measuring length a. Find out the surface area and the volume of the cube.

// A cube has 6 sides and the formulae for the area and volume are:

// Surface Area = 6a2
// Volume = a3

// Input Format
// One line with an integer denoting the side-length of the cube.

// Output Format
// 2 space-separated integers denoting the surface area and volume of the cube respectively.

// Examples
// Sample Input
// 7
// Expected Output
// 294 343


import java.util.*;
import java.lang.Math;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
		
	{
		Scanner sc= new Scanner(System.in);
		int inp=sc.nextInt();
		int sa=6*inp*inp;
		int v=inp*inp*inp;
		System.out.println(sa+" "+v);
	}
}
