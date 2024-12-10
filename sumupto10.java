Write a program to print the sum of the first 10 numbers (1-10).

Expected Output
55


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
		
		int s=0;
		for(int x=1;x<=10;x++){
			s+=x;
		}
		System.out.println(s);
		// your code goes here
	}
}
