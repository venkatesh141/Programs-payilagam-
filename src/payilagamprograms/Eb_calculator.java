package payilagamprograms;
import java.util.*;
public class Eb_calculator {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("calculate you electric bill");
		System.out.println("enter units");
		double units=io.nextDouble();
		double price=0,t1,t2,t3,t4,t5,t6;
		if(units>=0 && units<=100)
		{
			System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>100 && units<=200)
		{
			t1=units-100;
			price+=t1*2.25;
			System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>200 && units<=400)
		{
			t1=units-200;
			t2=200-100;
			price+=(t1*4.50)+(t2*2.25);
			System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>400 && units<=500)
		{
			t1=units-400;
			t2=400-200;
			t3=200-100;
			price+=(t1*6.00)+(t2*4.50)+(t3*2.25);
			System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>500 && units<=600)
		{

        	t1=units-500;
        	t2=500-400;
        	t3=400-100;
        	price+=(t1*8.00)+(t2*6.00)+(t3*4.50);
        	System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>600 && units<=800)
		{
        	t1=units-600;
        	t2=600-500;
        	t3=500-400;
        	t4=400-100;
        	price+=(t1*9.00)+(t2*8.00)+(t3*6.00)+(t4*4.50);
        	System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>800 && units<=1000)
		{

        	t1=units-800;
        	t2=800-600;
        	t3=600-500;
        	t4=500-400;
        	t5=400-100;
        	price+=(t1*10.00)+(t2*9.00)+(t3*8.00)+(t4*6.00)+(t5*4.50);
        	System.out.println("Your Electric bill amount is"+price);
		}
		else if(units>1000)
		{

        	t1=units-1000;
        	t2=1000-800;
        	t3=800-600;
        	t4=600-500;
        	t5=500-400;
        	t6=400-100;
        	price+=(t1*11.00)+(t2*10.00)+(t3*9.00)+(t4*8.00)+(t5*6.00)+(t6*4.50);
        	System.out.println("Your Electric bill amount is"+price);
		}
		else
		{
			System.out.println("Please enter valid units");
		}
	}
}
