import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int year;
		System.out.println("enter the year :");
		year=in.nextInt();
		
		if((year%4==0)||(year%400==0)||(year%100==0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
