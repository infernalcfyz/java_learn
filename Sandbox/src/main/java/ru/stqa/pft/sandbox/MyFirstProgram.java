package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args)
	{
		Point start = new Point(1,1);
		Point end = new Point (1,3);
		double d = start.distance(end);
		System.out.println("Расстояние между точками = " + d);
	}



}