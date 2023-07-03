package payilagamprograms;
import java.util.*;
public class Program28 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("enter two numbers for lcm");
		int n1=io.nextInt();
		int n2=io.nextInt();
		int large=(n1>n2)?n1:n2;
		while(true)
		{
			if(large % n1==0 && large %n2==0)
			{
				System.out.println("lcm of "+n1+" and "+n2+" is "+large);
				break;
			}
			large++;
		}
	}
}
