// Program for LinkedList
import java.util.*;

class LinkedListDemo{
	public static void main(String[] args) {
		LinkedList<String> object = new LinkedList<String>();

		object.add("A");
		object.add("B");
		object.add("C");
		object.add("D");
		object.add("E");

		System.out.println("Linked List : "+object);
		object.remove("B");
		object.remove(3);
		System.out.println("Linked List after deletion : "+object);
		object.set(2,"Y");
		System.out.println("Linked List : "+object);

	}
}