package sdfgh;

import java.util.Scanner;

public class Classixcal {
	
	public static void main(String[] args) {
		
		System.out.println("Gimme your 5 numbers Daddy!!!");
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		System.out.println("ok hmm, ok so um... yes here we go");
		if(a > b & a > c & a > d & a > e){
			System.out.println("ur mum says " + a + " the largest");
		}else if(b > a & b > c & b > d & b > e){
			System.out.println("ur mum says " + b + " the largest");
		}else if(c > a & c > b & c > d & c > e){
			System.out.println("ur mum says " + c + " the largest");
		}else if(d > a & d > b & d > c & d > e){
			System.out.println("ur mum says " + d + " the largest");
		}else if(e > a & e > b & e > c & e > d){
			System.out.println("ur mum says " + e + " the largest");
		}
		if(a < b & a < c & a < d & a < e){
			System.out.println("ur mum says " + a + " the smallest");
		}else if(b < a & b < c & b < d & b < e){
			System.out.println("ur mum says " + b + " the smallest");
		}else if(c < a & c < b & c < d & c < e){
			System.out.println("ur mum says " + c + " the smallest");
		}else if(d < a & d < b & d < c & d < e){
			System.out.println("ur mum says " + d + " the smallest");
		}else if(e < a & e < b & e < c & e < d){
			System.out.println("ur mum says " + e + " the smallest");
		}
		scanner.close();
	}

}

