package collection;
import java.util.*;
public class Program4 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		arr.add("venky");
		arr.add("ajay");
		arr.add("kumar");
		arr.add("anirudh");
		int index=io.nextInt();
		arr.add(index, "one");
	}
}
