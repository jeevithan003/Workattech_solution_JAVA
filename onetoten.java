Write a program to print numbers from 1 - 10 with each number printed in a separate line.

Expected Output
1
2
3
4
5
6
7
8
9
10

  import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{   int x=1;
		while(x<=10){
			System.out.println(x);
			x+=1;
		}
	}
}
