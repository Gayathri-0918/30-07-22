package sampleprogram2;
import java.util.Scanner;
public class Greatestnum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first integer");
		int n1=in.nextInt();
		System.out.println("Enter the second integer");
		int n2=in.nextInt();
		System.out.println("Enter the third integer");
		int n3=in.nextInt();
		if((n1>=n2)&&(n1>n3))
		System.out.println("the greatest number is="+n1);
		if((n2>n1)&&(n2>=n3))
		System.out.println("the greatest number is="+n2);
		if((n3>=n1)&&(n3>n2))
		System.out.println("the greatest number is="+n3);
		
		

	}

}
