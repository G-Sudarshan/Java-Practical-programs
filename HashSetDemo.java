// Program for HashSet
import java.util.*;

class HashSetDemo{
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();

		h.add("India");
		h.add("Austrelia");
		h.add("South Africa");
		h.add("India");
		h.add("United Kingdom");
		h.add("USA");

		System.out.println(h);

		h.remove("Austrelia");
		System.out.println("List after removing Austrelia : "+ h);
		System.out.println("Iterating over list : ");
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}