package payilagamprograms;
import java.util.*;
public class Program38 {
	
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int limit=io.nextInt();
		int f=-1,s=1,v;
		for(int i=1;i<=limit;i++)
		{
			v=f+s;
			f=s;
			s=v;
			boolean t=true;
			for(int j=2;j<=v/2;j++)
			{
				if(v%j==0)
				{
					t=false;
					break;
				}
			}
			if(t)
			{
				System.out.print(v+" ");
			}
		}
	}

}
