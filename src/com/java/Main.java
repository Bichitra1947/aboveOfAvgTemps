package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		calTemps();
	}
	public static void calTemps() {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of Days :");
		int NumberOfDay = scanner.nextInt();
		int temps[]=new int[NumberOfDay];
		int sum=0;
		int count=0;
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<NumberOfDay;i++) {
			System.out.print((i+1)+" day's max temparature is :");
			temps[i]=scanner.nextInt();
			
			sum=sum+temps[i];
		}
		float avg=sum/NumberOfDay;
		System.out.println("The Overall "+NumberOfDay+ " days avarage of temparature is : "+avg);
		
		for(int j=0;j<NumberOfDay;j++) {
			if(temps[j]>avg) {
				count++;
				list.add(temps[j]);
			}
		}
		System.out.print("number of above average temperature is : "+count);
		System.out.println(" i.e "+list);
	}
}
