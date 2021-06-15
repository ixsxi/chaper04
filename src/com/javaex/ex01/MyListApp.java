package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		
		
		
		System.out.println("=======================Point 관리=============================");
		
		//포인트를 관리하는 리스트( 배열 대용 )를 만든다.
		PointList pList = new PointList();
		
		
		Point p00 = new Point (2,2);
		Point p01 = new Point (3,3);
		//Point p02 = new Point (4,4);
		
		
		pList.add(p00); // 배열이 생성될때마다 넣어라 .. ?
		pList.add(p01);
		//pList.add(p02);
		
		
		
		
		System.out.println(pList);
		
		System.out.println(pList.size()); // 배열의 방의 갯수를 알려달라
		
		System.out.println(pList.get(1)); // 미리보기 ? 1첫번째껄 찍어라
		/*
		pList.remove(1); //  --  > 두번째 방 삭제 
		*/
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		
		System.out.println("=======================Point 관리=============================");

		System.out.println("=======================원관리=============================");
		
		CircleList cList = new CircleList();
		
		 
		
		 	Circle c00 = new Circle (2);
		 	Circle c01 = new Circle (3);
			//Point p02 = new Point (4,4);
			
			
			cList.add(c00); // 배열이 생성될때마다 넣어라 .. ?
			cList.add(c01);
			//pList.add(p02);
		 
		
			System.out.println(cList);
			
			System.out.println(cList.size()); // 배열의 방의 갯수를 알려달라
			
			System.out.println(cList.get(1)); // 미리보기 ? 1첫번째껄 찍어라
		
		
		
		
		
		
		
		
		
		
		
		/* 배열로 예제 ex
		Point[] pArray = new Point[2];
		
		Point p00 = new Point (2,2);
		Point p01 = new Point (3,3);

		pArray[0] = p00;
		pArray[1] = p01;
		
		
		for(int i =0; i<pArray.length; i++) {
			 System.out.println(pArray[i].toString()); // 굳 이 to String 안써두된다
		}
		*/
	}

}
