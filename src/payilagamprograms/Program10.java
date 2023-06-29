package payilagamprograms;
import java.util.*;
public class Program10 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int a=0,counter=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(counter+" ");
			counter+=i;
			
		}
	}
}
