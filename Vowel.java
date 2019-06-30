import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter : ");
		String str=in.next();
		String vowels="aeiou";
		String cons="bcdfghjklmnpqrstvwxyz";
		str=str.toLowerCase();
		if(vowels.contains(str)) {
			System.out.println("Vowels");
			
		}
		else if(cons.contains(str)) {
			System.out.println("Consonant");
			
		}
		else
		{
			System.out.println("invalid");
			
		}
	}
