
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String a=in.nextLine();
		StringBuilder input=new StringBuilder();
		input.append(a);
		input=input.reverse();
		System.out.println(input);
		
	}
}
