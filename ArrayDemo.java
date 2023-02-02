package com.codeo.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//arr[0]==> arr[2]
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=30;
		arr[2]=23;
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		System.out.println("The lenght of array: "+arr.length);
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
