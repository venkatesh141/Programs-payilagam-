package arrays;
import java.util.*;
public class Program25 {

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
		for(int i=0;i<n;i++)
		{
			if(a[i]==Integer.MIN_VALUE)
			{
				continue;
			}
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=Integer.MIN_VALUE;
				}
			}
			
		}
		System.out.println("array after deletion");
		for(int i=0;i<n;i++)
		{
			if(a[i]!=Integer.MIN_VALUE)
			System.out.print(a[i]+" ");
		}
	}
}
