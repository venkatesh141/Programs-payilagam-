package payilagamprograms;
import java.util.*;

public class Program34 {
	
	public static void main(String[] args)
	{
         Scanner io=new Scanner(System.in);
         int n=io.nextInt();
         int digits=0;
         while(n!=0)
         {
        	 digits++;
        	 n/=10;
         }
         System.out.println("no of digits are "+digits);
	}

}
