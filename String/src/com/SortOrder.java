package com;

public class SortOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "deepak";
		char arr[] = str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
		for(int j= i+1; i<arr.length;i++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			
		}
		System.out.println(new String(arr));

	}

}
