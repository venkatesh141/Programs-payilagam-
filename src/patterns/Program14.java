package patterns;
import java.util.*;
public class Program14 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int no=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no+=2;
			}
			System.out.println();
		}
	}
}
