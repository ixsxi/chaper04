package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lotto = new HashSet<Integer>();
		
		
		while(lotto.size() < 6) {
			int num =(int)(Math.random()*45)+1;
			System.out.println(num);
			lotto.add(num); //중복체크
			
		}
		
		System.out.println("============");
		for(int lottonum : lotto) {
			System.out.println(lottonum);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Set<Integer> rotto = new HashSet<Integer>();
		
		Integer r01 = (int)(Math.random() * 45);
		Integer r02 = (int)(Math.random() * 45);
		Integer r03 = (int)(Math.random() * 45);
		Integer r04 = (int)(Math.random() * 45);
		Integer r05 = (int)(Math.random() * 45);
		Integer r06 = (int)(Math.random() * 45);
		
		
		rotto.add(r01);
		rotto.add(r02);
		rotto.add(r03);
		rotto.add(r04);
		rotto.add(r05);
		rotto.add(r06);
		
		System.out.println(rotto.size());
		System.out.println(rotto);
		
		//
		//for(Integer num:rotto) {
			//System.out.println(num);
		///}
		*/
	}

}
