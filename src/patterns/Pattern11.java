package patterns;
import java.util.*;
public class Pattern11 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		for(int i=1;i<=n;i++)
		{
			int dummy=i;
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n)
				{
					if(i==n)
					{
					System.out.print(dummy+" ");
					dummy--;
					}
					else
					{
						System.out.print(dummy+" ");
						dummy++;
					}
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
