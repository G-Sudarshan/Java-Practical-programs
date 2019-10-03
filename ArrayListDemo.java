// Program for ArrayList
import java.io.*;
import java.util.*;


class ArrayListDemo{
	public static void main(String[] args)throws IOException {
		int n=5;
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);

		for(int i = 0 ; i<n ; i++){
			arrli.add(i);
		}

		System.out.println("ArrayList is : "+arrli);

		arrli.remove(3);

		System.out.println("ArrayList after remove(3) is : "+arrli);
		System.out.print("Using for loop Arraylist is : ");
		for (int i = 0 ; i < arrli.size() ; i++ ) {
			System.out.print(arrli.get(i)+" ");			
		}

	}
}