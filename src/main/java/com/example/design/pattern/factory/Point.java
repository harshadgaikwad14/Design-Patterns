package com.example.design.pattern.factory;

public class Point {
	
	
	private double x,y;
	
	private Point(final double x,final double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public static class Factory{
		
		
		public static Point newCartesianPoint(final double x,final double y)
		{
			return new Point(x+x, y+y);
		}
		
		public static Point newPolarPoint(final double x,final double y)
		{
			return new Point(x*x, y*y);
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
