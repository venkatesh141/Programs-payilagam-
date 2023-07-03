package payilagamprograms;
import java.util.*;

public class Program26 {

         public static void main(String[] args)
         {
        	 Scanner io=new Scanner(System.in);
        	 int n=io.nextInt();
        	 int i=2;
        	 while(i<=n)
        	 {
        		 if(n%i==0)
        		 {
        			 System.out.println("the smallest divisor is "+i);
        			 break;
        		 }
        		 i++;
        	 }
         }
 
}
