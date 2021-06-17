package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//HashSet 만든다.
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i00 = 4;
		Integer i01 = 5;
		Integer i02 = 6;
		
		
		
		iSet.add(i00);
		iSet.add(i01);
		iSet.add(i02);
	
		
		System.out.println(iSet.size());
		
		System.out.println(iSet.toString());
		System.out.println("-------------------------------");
		
		
		for(Integer num : iSet) {
			System.out.println(num);	
			
		}
		
		// 중복값을 넣는다.
		Integer i04 = 5;
		iSet.add(i04);
		System.out.println(iSet);
		
		
		for(Integer num : iSet) {
			System.out.println(num);
				
		}
		
		
		
		
	}
}
