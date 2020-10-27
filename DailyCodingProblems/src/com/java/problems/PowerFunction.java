package com.java.problems;

public class PowerFunction {
	
	public static void main(String[] args) {
		
		System.out.println(power(2, 10));
		
	}
	
	public static int power(int x, int y){
		int pow = 1;
		
		while(y>=1){
			pow = pow * x;
			y--;
		}
		
		return pow;
	}

}
