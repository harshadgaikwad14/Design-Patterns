package com.example.design.pattern.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 =Point.Factory.newCartesianPoint(2, 60);
		
		System.out.println(p1);
		
		
		Point p2=Point.Factory.newPolarPoint(5, 6);
		System.out.println(p2);

	}

}
