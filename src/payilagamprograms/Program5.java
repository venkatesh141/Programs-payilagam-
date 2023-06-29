package payilagamprograms;
import java.util.*;
public class Program5 {
	
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int st=1;
		while(st<=n)
		{
			
			System.out.print(st+" ");
			
			if(n%2==0)
			{
			if(st==n-1)
			{
				st=2;
			}
			else
			{
				st+=2;
			}
			}
			else
			{
				if(st==n)
				{
					st=2;
				}
				else
				{
					st+=2;
				}
			}
		}
	}

}
