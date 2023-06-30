package payilagamprograms;
import java.util.*;
public class Program23 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int r=0;
		while(n!=0)
		{
			r=n%10;
			System.out.print(r);
			n/=10;
		}
	}
}
