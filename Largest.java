import java.util.Scanner;

public class Largest {
     public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]=new int[3];
		System.out.println("enter the values:");
		for(int i=0;i<=2;i++)
		{
			arr[i]=in.nextInt();
		}
		int max=arr[0];
	
		
		for(int i=1;i<=2;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}
}
