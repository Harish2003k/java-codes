package com.java.demo;

abstract class shape{
	abstract void draw();
}
class Rectangle extends shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
           	class Circle1 extends shape{
		        void draw() {
			       System.out.println("Drawing circle");
		}
	}
	public class abstractionOops{
		public static void main(String args[]) {
			shape s=new Circle1();
			s.draw();
			shape s1=new Rectangle();
			s1.draw();
		}
	}

