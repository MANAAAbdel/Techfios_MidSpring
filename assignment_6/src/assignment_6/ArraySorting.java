package assignment_6;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		
	    //Creating an array with 500 values between 100 and 1000
	    //I made a choice to make the values integers 
		int[] A;
		A = new int[500];
		for (int i=0; i<500; i++) {
			A[i]= (int)(Math.random()*900+100);
		}
		
		// Reading from The N number from user 
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter N");
		int N = input.nextInt();
		input.close();
		
		//Printing Array before sorting
		arrayPrinting(A);
		
		//Sorting the array
		sorting(A);
		
		//Printing Array after sorting
		arrayPrinting(A);
		
		//Getting the Nth smallest element
		System.out.println("This is the "+N+" smallest element "+ getElement(A,N));
		
	}
	// Printing an Array method
	public static void arrayPrinting(int[] A) {
		for(int value:A) {
			System.out.println(value);
		}
	}
	
	//A method for sorting an array
	public static void sorting(int A[]) {
		for (int i=0; i<A.length;i++) {
			for(int j=i; j<A.length;j++) {
				if (A[i]>A[j]) {
					swap(A,i,j);
				}
			}
		}
	}
	
	//Swap method that switch two elements of an array
	public static void swap(int A[], int first, int second) {
		int middle;
		middle = A[first];
		A[first]= A[second];
		A[second]= middle;
	}
	// Method that get the Nth element
	public static int getElement(int[] A,int N) {
		sorting(A);
		return A[N];
	}

}
