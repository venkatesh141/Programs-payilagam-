package payilagamprograms;
import java.util.*;
public class Program37 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int temp=n,sum=0,pro=1;
		int t;
		while(temp!=0)
		{
			t=temp%10;
			sum+=t;
			pro*=t;
			temp/=10;
		}
		if(sum==pro)
		{
			System.out.println("it is spy number");
		}
		else
		{
			System.out.println("it is not spy number");
		}
		
	}
}
