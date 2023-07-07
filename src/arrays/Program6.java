package arrays;
import java.util.*;
public class Program6 {

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
		System.out.println("enter the element to delete");
		int d=io.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==d)
			{
				if(i!=n-1)
				{
					for(int j=i;j<n-1;j++)
					{
						a[j]=a[j+1];
						
					}
					break;
				}
			}
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
