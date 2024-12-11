// Sample Input
// 4
// 23
// 12
// 44
// 32
// Expected Output
// ODD
// EVEN
// EVEN
// EVEN


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
		
		Scanner sc= new Scanner (System.in);
		int a;
		a=sc.nextInt();
		int x[]= new int[a];
		for(int i=0;i<a;i++){
			x[i]=sc.nextInt();
		}
		for(int b: x){
			if(b%2==0){
				System.out.println("EVEN");
			}
			else{
				System.out.println("ODD");
			}
		}
		// your code goes here
	}
}
