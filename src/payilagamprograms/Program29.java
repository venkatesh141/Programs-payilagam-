package payilagamprograms;
import java.util.*;
public class Program29 {
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		lcm(n);
		
	}
	public static void lcm(int n)
	{
		if(n==0)
			return;
		lcm(n/2);
		int a=n%2;
		System.out.print(a);
		
	}
	
	

}
