import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n =sc.nextInt();
		if(n>0) {
			if(n%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}else {
			System.out.println("invalid");
		}
	}
}
