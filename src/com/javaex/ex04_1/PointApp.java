package com.javaex.ex04_1;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point point0 = new Point(1,2);
		Point point1 = new Point(2,3);
		Point point2 = new Point(4,5);
		Point point3 = new Point(8,8);
		
		
		pList.add(point0);
		pList.add(point1);
		pList.add(point2);
		pList.add(point3);
		
		
		pList.remove(1);
		System.out.println(pList.size());
		
		System.out.println(point1);
		
		for(int i= 0; i<pList.size(); i ++) {
			System.out.println(pList.toString());
			System.out.println("-----");
		}
		
		
		// 근데 나는 여기서 x y 따로 보고싶다.?
		System.out.println(pList.get(1));
		
		Point p = pList.get(2);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		
		for(int i =0; i<pList.size(); i++) {
			Point pp =pList.get(i);
			System.out.println(pp.getX());
		}
		
		
		
		
		
		
		/*  일반 배열
		Point[] Parray = new Point[3];

		
		Parray[0] = new Point(3,5);
		Parray[1] = new Point(2,1);
		Parray[2] = new Point(8,5);
		
		//System.out.println();
		
		
		
		for(int i = 0 ; i<Parray.length; i++) {
			System.out.println(Parray[i]);
		}
		*/
		
		
	}

}
