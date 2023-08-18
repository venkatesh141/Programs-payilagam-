package collection;
import java.util.*;
public class Program3 {
	
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(23);
		arr.add(11);
		arr.add(77);
		arr.add(100);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
	}

}
