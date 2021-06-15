package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	
	
	
	 //필드
		private Point[] pArray;
		private int crtPos; // 현재 포지션 

	
	//생성자
	
	public PointList() { // 디폴트 생성자
		super();
		this.pArray = new Point[3]; // 포인트라는 배열을 pArray 변수에 저장 배열은 가변임
		crtPos = 0;
	}
	 
	//메소드 gs
	
	
	// 메소드 일반
	
	public void add(Point point) { //add 동작 메소드 의 조건 
		pArray[crtPos] =point;
		crtPos ++;
		
	}

	
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	@Override
	public String toString() { 
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
}
