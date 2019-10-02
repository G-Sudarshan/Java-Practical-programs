//Program for Single Dimensional array
import java.util.*;

class SingleDimensionalArray
{
	public static void main(String[] args) {
		int i;
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements : ");

		for (i=0;i<5 ;i++ ) {

			System.out.println("Enter element "+(i+1)+" : ");
			arr[i] = sc.nextInt();
			
		}

		System.out.println("Elements are");

		for (i=0;i<5 ;i++ ) {
			System.out.println("arr["+i+"] : "+arr[i]);			
		}
	}
}