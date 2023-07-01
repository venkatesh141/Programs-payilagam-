package payilagamprograms;
import java.util.*;
public class Program20 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		double sqroot=n/2,t;
		do
		{
			t=sqroot;
			sqroot=(t+(n/t))/2;
			
		}while((t-sqroot)!=0);
		System.out.println("square root of a given number is "+sqroot);
		
	}
}
