package collection;
import java.util.*;
public class Program5 {

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		arr.add("four");
		int index=io.nextInt();
		arr.remove(index);
	}
}
