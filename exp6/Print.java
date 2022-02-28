import java.io.*;

abstract class Shape
{
	int i1=2;
	int i2=4;
	abstract void printArea();
};

class Rectangle extends Shape
{
	int area;
	public void printArea()
	{
		area=i1*i2;
		System.out.println("The area of a rectangle with length "+i1+" and breadth "+i2+" is "+area);
	}
};

class Triangle extends Shape
{
	int area;
	public void printArea()
	{
		area=(i1*i2)/2;
		System.out.println("The area of a triangle with base "+i1+" and height "+i2+" is "+area);
	}
};

class Circle extends Shape
{
	double area;
	public void printArea()
	{
		area=(3.14*i1*i1);
		System.out.println("The area of a circle with radius "+i1+" is "+area);
	}
};

public class Print
{
	public static void main(String args[])
	{
		Shape o = new Rectangle();
		Shape obj = new Triangle();
		Shape object = new Circle();
		
		o.printArea();
		obj.printArea();
		object.printArea();
	}
}