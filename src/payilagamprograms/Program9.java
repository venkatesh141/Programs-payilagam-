package payilagamprograms;
import java.util.*;
public class Program9 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int a;
		for(int i=1;i<=n;i++)
		{
			a=1;
			for(int j=1;j<=i;j++)
			{
				a*=i;
			}
			System.out.print(a+" ");
		}
	}
}
