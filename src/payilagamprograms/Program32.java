package payilagamprograms;
import java.util.*;
public class Program32 {
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int digits=0,s=n;
		while(s!=0)
		{
			digits++;
			s/=10;
		}
		s=n;
		int pow=1,sum=0;
		while(s!=0)
		{
			int t=s%10;
			pow=1;
			for(int i=1;i<=digits;i++)
			{
				pow*=t;
			}
			sum+=pow;
			s/=10;
		}
		if(sum==n)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
