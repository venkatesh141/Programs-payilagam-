package electronic_shop;
import java.util.*;
public class Electronicshop {
    static Scanner io=new Scanner(System.in);
	String name,mobile_no;
	Laptop[] laptops;
	public Electronicshop(String name,String mobile_no,int no_of_laptops)
	{
		this.name=name;
		this.mobile_no=mobile_no;
		this.laptops=new Laptop[no_of_laptops];
		
	}
	public void compute_laptop()
	{
		int n=laptops.length;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter price of "+(i+1)+"st Laptop");
			double price=io.nextDouble();
			Laptop l=new Laptop(price);
			laptops[i]=l;
		}
		print_details();
		
	}
	private void print_details()
	{
		int n=laptops.length;
		double total=0;
		for(int i=0;i<n;i++)
		{
			double laptop_price=laptops[i].price;
			total+=laptop_price-(calculate_discount(laptop_price));
		}
		System.out.println("Customer Name is "+name);
		System.out.println("Mobile number is "+mobile_no);
		System.out.println("no of laptops purchased is "+n);
		System.out.println("Discount price is "+total);
		System.out.println("--------------------------");
		
	}
	public double calculate_discount(double price)
	{
	      double calculated_discount=0;
	      if(price<=25000)
	      {
	    	  calculated_discount=(5.0*price)/100;
	      }
	      else if(price>25000 && price<=50000)
	      {
	    	  calculated_discount=(7.5*price)/100;
	      }
	      else if(price>50000 && price<=100000)
	      {
	    	  calculated_discount=(10.0*price)/100;
	      }
	      else if(price>100000)
	      {
	    	  calculated_discount=(15.0*price)/100;
	      }
	      System.out.println("calculated price is "+calculated_discount);
	      return calculated_discount;
	}
	
	public static void main(String[] args)
	{
		System.out.println("enter name");
		String name=io.next();
		System.out.println("enter mobileno");
		String mobile_no=io.next();
		System.out.println("enter no of laptops");
		int no_of_laptops=io.nextInt();
		Electronicshop sh=new Electronicshop(name,mobile_no,no_of_laptops);
		sh.compute_laptop();
		
		
	}
}
