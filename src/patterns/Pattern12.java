package patterns;
import java.util.*;
public class Pattern12 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int mid=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==mid || j==n-mid+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			if(i<=n/2)
			{
				mid--;
			}
			else
			{
				mid++;
			}
			System.out.println();
		}
	}
}
