package payilagamprograms;
import java.util.*;
public class Program14 {
        public static void main(String[] args)
        {
        	Scanner io=new Scanner(System.in);
        	int n=io.nextInt();
        	boolean j=true;
        	for(int i=2;i<=n/2;i++)
        	{
        		if(n%i==0)
        		{
        			j=false;
        			break;
        		}
        	}
        	if(j)
        	{
        		System.out.println("it is prime");
        		
        	}
        	else
        	{
        		System.out.println("it is not prime");
        	}
        	
        }
}
