package sampleprogram2;
import java.util.Scanner;
public class Pickweekdays {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num of day");
		int num=in.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("sunday");
			break;
		
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println(("Tuesday"));
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}
			

	}

}
