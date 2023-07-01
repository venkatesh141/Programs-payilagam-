package payilagamprograms;
import java.util.*;
public class Program22 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int f=-1,s=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(f+s+" ");
			f=f-(s=f+s);
			if(f<0)
				f=f*-1;
			
		}
	}
}
