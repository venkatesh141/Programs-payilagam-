package arrays;
import java.util.*;
public class Program4 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("enter the size");
		int n=io.nextInt();
		int a[]=new int[n];
		System.out.println("enter the inputs");
		for(int i=0;i<n;i++)
		{
			a[i]=io.nextInt();
		}
		System.out.println("enter searching element");
		int k=io.nextInt();
		for(int i=0;i<n;i++)
		{
			if(k==a[i])
			{
				System.out.println("element found");
				return;
			}
		}
		System.out.println("not found");
		
	}
}
