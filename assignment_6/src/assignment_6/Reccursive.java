package assignment_6;

public class Reccursive {

	public static void main(String[] args) {
		int A[]= {45,87,10000,10,12,10,588,25,247,12,1,2,3,8,7,5,6};
				
		for (int i=0; i<A.length;i++) {
			for(int j=i; j<A.length;j++) {
				if (A[i]>A[j]) {
					swap(A,i,j);
				}
			}
		}
		for(int value: A) {
			System.out.println(value);
		}
		
	}
	
	// QuickSort method that sort the array 
	public static void quickSort(int A[], int start, int end) {
		if (start < end) {
			int pindex = partition(A, start,end);
			quickSort(A, start, pindex-1);
			quickSort(A, pindex+1, end);
		}
	}
	
	// Partition method that partion the array and return an index 
	public static int partition (int A[], int start, int end) {
		double pivot = A[end];
		int pindex= start;
		for (int i= start; i<end ; i++) {
			if (A[i] <= pivot) {
				swap (A,i, pindex);
				pindex ++;
			}	
		}
		swap (A, pindex, end);
		return pindex;
	}
	
	
	// Swap method that switch two elements of the array
	public static void swap(int A[], int first, int second) {
		int middle;
		middle = A[first];
		A[first]= A[second];
		A[second]= middle;
	}

}
