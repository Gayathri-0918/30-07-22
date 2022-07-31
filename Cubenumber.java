package sampleprogram2;
import java.util.Scanner;

public class Cubenumber {

	public static void main(String[] args) 
	{
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			
			System.out.println("the cube value "+i+" is="+i*i*i);
		}
		

	}

}
