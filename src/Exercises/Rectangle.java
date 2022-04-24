package Exercises;

public class Rectangle {
	private int length;
	private int breadth;
	
	Rectangle(int l,int b){
		length=l;
		breadth=b;
		//this.breadth=b;
	}
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth=breadth;
	}
	public int getBreadth() {
		return breadth;
	}

	public void calculatePerimeter() {
		//int Peri;
		int peri = 2*(length + breadth);
		System.out.println("The Perimeter is :"+peri);
	}

}
