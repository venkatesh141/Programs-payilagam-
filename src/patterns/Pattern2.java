package patterns;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
5
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*/