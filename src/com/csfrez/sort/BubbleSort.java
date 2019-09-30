package com.csfrez.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = new int[] {5,8,6,3,9,2,1,7};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void sort(int array[]) {
		for(int i=0; i < array.length-1; i++) {
			//有序标记，每一轮的初始值都是true
			boolean isSorted = true;
			for(int j=0; j < array.length-i-1; j++) {
				int tmp = 0;
				if(array[j] > array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					//因为有元素进行交换，所以不是有序的，标记变为false
					isSorted = false;
				}
			}
			System.out.println("i="+i+", lenth="+array.length+", array="+Arrays.toString(array));
			if(isSorted) {
				break;
			}
		}
	}

}
