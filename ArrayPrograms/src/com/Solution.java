package com;

public class Solution {

	public static void main(String[] args) {
		String [] subject = {"java","html","css","javascript"};
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]);
			
		}
		System.out.println("-----");
		//backword
		for(int i=subject.length-1; i>=0; i--) {
			System.out.println(subject[i]);
			
		}

	}

}
