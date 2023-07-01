package payilagamprograms;
import java.util.*;

public class Program36 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int sq=n*n,sum=0,t=0;
		while(sq!=0)
		{
		  t=sq%10;
		  sum+=t;
		  sq/=10;
		}
		if(sum==n)
		{
			System.out.println("given number is neon");
		}
		else
		{
			System.out.println("given no is not neon");
		}
	}
}
