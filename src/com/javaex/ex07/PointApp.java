package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Point> pSet = new HashSet<Point>();
		
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		
		for(Point p:pSet) {
			System.out.println(p);
		}
		
		System.out.println(pSet);
		
		
		// 중복체크가 되는가 ? 중복으로 정의가 필요함 
		Point p04 = new Point (3,6);
		pSet.add(p04);
		
		System.out.println(pSet);
	}

}