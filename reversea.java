import java.util.Scanner;

public class reversea {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		StringBuilder input=new StringBuilder();
		input.append(a);
		input=input.reverse();
		System.out.println(input);
		
	}
}
