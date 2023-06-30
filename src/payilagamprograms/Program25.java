package payilagamprograms;
import java.util.*;
public class Program25 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int r=0,t=0,temp=n;
		while(n!=0)
		{
			t=n%10;
			r=(r*10)+t;
			n/=10;
		}
		if(r==temp)
		{
			System.out.println("yes it is palindrome");
		}
		else
		{
			System.out.println("no it is not palindrome");
		}
	}
}
