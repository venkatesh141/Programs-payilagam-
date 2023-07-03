package payilagamprograms;
import java.util.*;
public class Program27 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n1=io.nextInt();
		int n2=io.nextInt();
	    int gcd = 1;
	    for (int i = 1;i <= n1 && i <= n2;i++) {
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
}
