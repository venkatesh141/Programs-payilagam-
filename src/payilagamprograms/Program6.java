package payilagamprograms;
import java.util.*;
public class Program6 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			a*=11;
		}
	}
}
