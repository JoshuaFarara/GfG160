package gfg160;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int arr1[] = {10, 20, 30};
		int arr2[] = {0, 0};
		System.out.println(Arrays.toString(moveZeroes(arr)));

	}
	public static int[] moveZeroes(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		int[] tempZero = new int[n];
		
		for (int i = 0; i<n;i++) {
			if(arr[i] == 0) {
				tempZero[i] = arr[i];
			}else {
				temp[i] = arr[i];
			}
		}
		
//		for (int i = 0; i<) {
//			
//		}
//		arr = temp;
		return temp;
	}

}
