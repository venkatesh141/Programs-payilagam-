package payilagamprograms;
import java.util.*;
public class Program21 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int f=-1,s=1,value=0;
		for(int i=1;i<=n;i++)
		{
			value=f+s;
			System.out.print(value+" ");
			f=s;
			s=value;
		}
	}
}
