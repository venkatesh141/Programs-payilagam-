package payilagamprograms;
import java.util.*;
public class Program24 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int t,r=0;
		while(n!=0)
		{
			t=n%10;
			r=(r*10)+t;//important
			n/=10;
		}
		System.out.println("reversed number  is "+r);
	}
}
