// Program for two dimensional array

import java.util.*;

class TwoDimensionalArray
{
	public static void main(String[] args) {
		int i,j;
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		for (i=0;i<2 ;i++ ) {
			for (j=0;j<3 ;j++ ) {
				System.out.println("Enter element ["+i+"]["+j+"] : ");
				arr[i][j] = sc.nextInt();
			}
			
		}

		System.out.println("Elements are : ");

		for (i=0;i<2 ;i++ ) {

			for (j=0;j<3 ;j++ ) {

				System.out.print("         arr["+i+"]["+j+"] : "+arr[i][j]);
				
			}
			System.out.println();
		}
	}
}