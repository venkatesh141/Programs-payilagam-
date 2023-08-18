package collection;
import java.util.*;

public class Program8 {

	public static void main(String[] args)
	{
		ArrayList arr=new ArrayList();
		arr.add("venky");
		arr.add("bala");
		arr.add("ajith");
		arr.add("monish");
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
	}
}
