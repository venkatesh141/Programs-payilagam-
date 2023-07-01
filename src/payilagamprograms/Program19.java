package payilagamprograms;
import java.util.*;
public class Program19 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		for(int i=n;i>=1;i--)
		{
			int sum=1;
			for(int j=i;j>1;j--)
			{
				sum*=j;
			}
			System.out.print(sum+" ");
		}
	}
}
