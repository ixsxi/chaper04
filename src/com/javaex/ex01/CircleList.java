package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	
	
	private Circle[] cArray;
	private int crtPos;
	
	
	
	
	public CircleList() {
		super();
		this.cArray = new Circle[3];
		crtPos = 0;
	}
	
	
	
	public void add(Circle circle) { //add 동작 메소드 의 조건 
		cArray[crtPos] =circle;
		crtPos ++;
		
	}

	
	
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}



	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
