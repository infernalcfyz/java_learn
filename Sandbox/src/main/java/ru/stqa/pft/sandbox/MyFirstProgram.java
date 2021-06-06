package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args)
	{
		System.out.println("Hello, world!");
		Square s = new Square(5);
		Rectangle r = new Rectangle(4, 6);
		Point start = new Point();
		Point end = new Point ();
		start.x = 1;
		start.y = 1;
		end.x = 1;
		end.y = 2;
		double d = distance(start, end);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
		System.out.println("Расстояние между точками = " + d);
	}
	public static double distance(Point p1, Point p2) {
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}



}