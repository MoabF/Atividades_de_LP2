import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    List <Integer> num = new ArrayList <> ();
	    num.add(5);
	    num.add(6);
	    num.add(3);
	    num.add(1);
	    num.add(4);
	    num.add(2);
		System.out.println(num);
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
	}
}