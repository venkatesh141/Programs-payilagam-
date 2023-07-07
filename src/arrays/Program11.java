package arrays;
import java.util.*;
public class Program11 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		System.out.println("enter inputs");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=io.nextInt();
		}
		int first=Integer.MIN_VALUE,second=second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]<first && a[i]>second)
			{
			  second=a[i];
			}
		}
		System.out.println("first  largest "+first);
		System.out.println("second largest "+second);
	}
}
