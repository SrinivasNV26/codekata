package Beginner;

import java.util.Scanner;
public class code {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("enter the string :");
	String c= in.next();
	char str = c.charAt(0);
	//System.out.println("enter the string :");
	if((str>= 65 && str <= 90)|| (str >= 97 && str <= 122)) 

	{
		System.out.println("Alphabet");
	}
	else
	{
		System.out.println("No");
		}
	
	
}
}
