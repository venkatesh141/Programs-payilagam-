package arrays;
import java.util.*;
public class Program13 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		System.out.println("enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=io.nextInt();
		}
		int c=1,count=0;
		for(int i=0;i<n;i++)
		{
			c=1;
			if(a[i]==-1)
			{
				continue;
			}
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j]) {
					c++;
					a[j]=-1;
				}
			}
			if(c>1)
			count+=c-1;
		}
		System.out.println("count of duplicate is "+count);
	}

}
