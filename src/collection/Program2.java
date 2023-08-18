package collection;
import java.util.*;
public class Program2 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		HashMap<String,Integer> h=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter key in string");
			String k=io.next();
			System.out.println("enter value in int");
			int v=io.nextInt();
			h.put(k, v);
		}
		sort_by_key(h);
	}
	public static void sort_by_key(HashMap<String,Integer> h)
	{
		TreeMap<String,Integer> t=new TreeMap<>();
		t.putAll(h);
		System.out.println(t);
	}
}
