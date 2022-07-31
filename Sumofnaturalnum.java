package sampleprogram2;
import java.util.Scanner;

public class Sumofnaturalnum {

	public static void main(String[] args)
	{
	int i, n, sum=0;
	   {
	   Scanner in = new Scanner(System.in);  
	        System.out.print("Input number: ");  
	         n = in.nextInt();
	}
	  System.out.println("The first n natural numbers are : "+n);
	  
	 for(i=1;i<=n;i++)
	   {
	     System.out.println(i);
	     sum+=i;
	   }
	 System.out.println("the sum of natural number is"+sum);
}
}


	

