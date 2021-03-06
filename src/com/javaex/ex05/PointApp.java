package com.javaex.ex05;

import java.util.ArrayList;
import java.util.List;



public class PointApp {

	public static void main(String[] args) {
		List<Point> pList = new ArrayList<Point>(); //제네릭 Point로 첨에 ArrayList는 오브젝트임
		//List<Point> pList = new linkedList<Point>();
		
		Point p01 = new Point(2,4);
		Point p02 = new Point(3,6);
		Point p03 = new Point(4,8);
		Point p04 = new Point(5,10);
		
		
		pList.add(p01); // 배열에 주소넣기
		System.out.println(pList.size());
		
		
		pList.add(p02); // 배열에 주소넣기
		System.out.println(pList.size());
		
		pList.add(p03);
		System.out.println(pList.size());
		
		pList.add(p04);
		System.out.println(pList.size());
		
		Point p = pList.get(1);
		System.out.println(pList.get(2));
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.toString());
		
		System.out.println("----------------------------");
		
		for(int i = 0 ; i<pList.size(); i ++) {
			Point PP = pList.get(i);
			System.out.println(PP.toString());
		}
		System.out.println("----------------------------");
		
		for(int i = 0 ; i<pList.size(); i ++) {
			//Point PP = pList.get(i);
			System.out.println(pList.get(i).getX());
		}
		System.out.println("---------------------------");
		System.out.println(pList.toString());
		
		
		//p04 를 -- > [1]add 
		pList.add(1, p04);
		System.out.println(pList);
		
		
		//[1]를 삭제
		pList.remove(1);
		System.out.println(pList);
		
		
		System.out.println("---------------------------");
		//항상된 for문 무조건 처음 -- > 끝
		for( Point ppp : pList) {
			
			System.out.println(ppp);
		}
		
		System.out.println(pList);
		//pList 원 추가
		
		
		
		Circle c01 = new Circle(100);
		//pList.add(c01); // 원은 추가할 수 없다.
		
	}

}
