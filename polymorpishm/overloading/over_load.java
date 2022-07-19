package polymorphism;

import java.util.Scanner;

public class over_load
{
	int sq_area,rec_area;
	double cir_area,cyl_area;
	 
	Scanner sc=new Scanner(System.in);
	public int area(int a)
	{//square
		System.out.println("Enter the side of square: ");
		a = sc.nextInt();
		sq_area=a*a;
		System.out.println("area of square:"+sq_area);
		return sq_area;
	}
	public void area(int l,int b)
	{//rectangle
		System.out.println("Enter the length and breadth of rectangle: ");
		l = sc.nextInt();
		b = sc.nextInt();
		rec_area=l*b;
		System.out.println("area of rectangle:"+rec_area);
	}
	public void area(double r)
	{//circle
		System.out.println("Enter the radius of circle: ");
		r = sc.nextInt();
		cir_area= (3.14*r*r);
		System.out.println("area of circle:"+cir_area);
	}
	public void area( double l,double h, double tri_area)
	{//triangle
		System.out.println("Enter the length and height of triangle: ");
		l = sc.nextInt();
		h = sc.nextInt();
		tri_area=(0.5*l*h);
		System.out.println("area of triangle:"+tri_area);
	}
	public void area(double r, double h)
	{//cylinder
		System.out.println("Enter the radius and height of cylinder: ");
		r = sc.nextInt();
		h = sc.nextInt();
		cyl_area=(2*3.14*((r*h)+(r*r)));
		System.out.println("area of cylinder:"+cyl_area);
	}
}
