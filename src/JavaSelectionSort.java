
public class JavaSelectionSort {
	
	public static void selectionSort(int arr[]) {
		int len = arr.length;
		for (int i=0; i< len - 1; i++) {
			int min = i;
			
			for (int j=i+1; j<len; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
				// System.out.println("min = " + min + " i = " + i + " j = " + j);
			}
			
			
			// for swapping elements
			if (min != i) {
				swap(arr, i, min);
			}
		}
	}
	
	private static void swap(int arr[], int firstIndex, int lastIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[lastIndex];
		arr[lastIndex] = temp;
		
		showArr(arr);
	}
	
	public static void showArr(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10, 2, 5, 23, 11, 47, 6};
		System.out.print("Before sort: ");
		showArr(arr);
		selectionSort(arr);
		
		System.out.print("After sort: ");
		showArr(arr);
		
		

	}

}
