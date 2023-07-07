package arrays;
import java.util.*;
public class Program14 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int a[]=new int[n];
		System.out.println("enter inputs");
		for(int i=0;i<n;i++)
		{
			a[i]=io.nextInt();
		}
		System.out.println("no of times rotate");
		int r=io.nextInt();
		while(r!=0)
		{
			int arr=a[0];
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1];
			}
			a[n-1]=arr;
			r--;
		}
		System.out.println("left rotated array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
