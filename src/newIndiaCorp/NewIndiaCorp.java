package newIndiaCorp;
import java.util.*;
public class NewIndiaCorp {

	static Scanner io=new Scanner(System.in);
	public static double calculate_pay(double base_pay,int hours)
	{
		double sal=0;
		if(hours<=40)
		{
			sal=hours*base_pay;
			return sal;
		}
		else if(hours>40)
		{
			sal=40*base_pay;
			sal+=(hours-40)*(base_pay*1.5);
			return sal;
		}
		return sal;
		
	}
	public static void main(String[] args)
	{
		System.out.println("enter base_pay and hours");
		double base_pay=io.nextDouble();
		int hours=io.nextInt();
		if(base_pay<50.0 || hours>60)
		{
			System.out.println("Error Enter Correct input");
			return;
		}
		double sal=calculate_pay(base_pay,hours);
		System.out.println("basic salary of employee is "+sal);
		
	}
}
