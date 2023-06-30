package payilagamprograms;
import java.util.*;
public class Program17 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int factorial=1;
		for(int i=n;i>1;i--)
		{
			factorial*=i;
		}
		System.out.println("factorial is "+factorial);
		
	}
}
