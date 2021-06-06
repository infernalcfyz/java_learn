package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args)
	{
		Point start = new Point(1,2);
		Point end = new Point (3,4);
		double d = start.distance(end);
		System.out.println("Расстояние между точками = " + d);
	}



}