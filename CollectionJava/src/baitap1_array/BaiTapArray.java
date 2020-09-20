package baitap1_array;

import java.util.ArrayList;
import java.util.Arrays;

public class BaiTapArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		insert(arr, 5);
		delete(arr, 2);
	}

	public static void insert(int[] arr, int a) {
//		ArrayList<Integer> arrList = new
	}

	public static void delete(int[] arr, int index) {
		int n = arr.length;
		int[] arr1 = new int[n - 1];

		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i != index) {
				arr1[j] = arr[i];
				j++;
			}
		}
		for (int e : arr1) {
			System.out.print(e + "  ");
		}
	}
}
