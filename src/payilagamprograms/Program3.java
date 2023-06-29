package payilagamprograms;
import java.util.*;
public class Program3 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int st=2;
		for(int i=1;i<=n;i++)
		{
			System.out.print(st+" ");
			st+=2;
		}
	}
}
