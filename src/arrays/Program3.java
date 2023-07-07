package arrays;
import java.util.*;
public class Program3 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=io.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
