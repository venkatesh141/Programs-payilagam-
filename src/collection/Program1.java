package collection;
import java.util.*;


public class Program1 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hashmap=new HashMap<>();
	    Scanner io=new Scanner(System.in);
	    int n=io.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	String v=io.next();
	    	hashmap.put(i, v);
	    }
	     Iterator itr=hashmap.entrySet().iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	}
}
