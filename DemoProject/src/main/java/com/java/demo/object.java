package com.java.demo;
      // how to create object in java programe
class otherClass{
	public void hello() {
		System.out.println("hello world");
	}
}
class Num{
	public void Number() {
		int x=10;
		System.out.println(x);
	}
}
class Name{
	public void NameCall() {
		String s1="Harish kumar gupta";
		System.out.println(s1);
	}
}
public class object {
	public static void main(String args[]) {
		otherClass obj = new otherClass();
		obj.hello();
		Num obj1 =new Num();
		obj1.Number();
		Name obj2 =new Name();
		obj2.NameCall();
	}

}
