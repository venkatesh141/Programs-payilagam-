package payilagamprograms;
import java.util.*;
public class Program16 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum of first n numbers"+sum);
	}
}
