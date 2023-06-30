package payilagamprograms;
import java.util.*;

public class Program15 {
	
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
        
		int count=0;
		for(int i=2;i<=100;i++)
		{
			boolean a=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					a=false;
					break;
				}
			}
			if(a)
			{
				count++;
				System.out.print(i+" ");
			}
			if(count==20)
			{
				break;
			}
		}
	}

}
