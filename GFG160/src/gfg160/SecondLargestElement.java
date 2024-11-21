package gfg160;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		int[] arr1 = {10, 5, 10};
		int[] arr2 = {10, 10, 10};
		int[] arr3 = {1};
		System.out.println(getSecondLargest(arr));
		System.out.println(getSecondLargest(arr1));
		System.out.println(getSecondLargest(arr2));
		System.out.println(getSecondLargest(arr3));
	}
	
	public static int getSecondLargest(int[] arr) {
		int n = arr.length;
		if(n<2) return -1; // if an array has less then 2 elements, cant find max and second largest. 
		
		int largest = -1;
		int secondLargest = -1;
	
		 // finding the second largest element
        for (int i = 0; i < n; i++) {

            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
          
            // If arr[i] < largest and arr[i] > second largest, 
            // update second largest with arr[i]
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }	
}
