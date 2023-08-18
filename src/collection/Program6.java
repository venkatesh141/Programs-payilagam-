package collection;
import java.util.*;

public class Program6 {

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add("venky");
		ll.add(6);
		ArrayList ar=new ArrayList(ll);
		System.out.println(ar);
	}
}
