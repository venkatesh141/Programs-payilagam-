package payilagamprograms;
import java.util.*;
public class Program35 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int sum=0,s=n,fact=1;
		while(s!=0)
		{
			int t=s%10;
			fact=1;
			for(int i=t;i>1;i--)
			{
				fact*=i;
			}
			sum+=fact;
	       s/=10;
		}
		if(sum==n)
		{
			System.out.println("given number is strong number");
		}
		else
		{
			System.out.println("given number is not strong number");
		}
	}
}
