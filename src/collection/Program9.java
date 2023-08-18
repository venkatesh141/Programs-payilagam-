package collection;
import java.util.*;

public class Program9 {

	public static void main(String[] args)
	{
		TreeMap<String,Integer> tm= new TreeMap<>();
		tm.put("venky", 1);
		tm.put("ajith", 2);
		tm.put("monish", 3);
		Iterator it=tm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
