package studio7;

public class Rectangle {
private int length; 
private int width; 
private int area; 
private int perimeter; 

public Rectangle(int length, int width, int area, int perimeter){
	this.length = length; 
	this.width = width;
	this.area = length*width; 
	this.perimeter = 2*length+2*width; 	
}

public int getArea(){
return this.area ; 
}
public int getPerimeter() {
return this.perimeter;	
}
 
public void setArea(int newArea) {
this.area = newArea; 
return;
}

public boolean isSquare() {
	if(length == width) {
		return true;
	} else {
		return false;
	}
		
}
	public boolean isGreater(Rectangle other) {
		if (this.area<other.area) {
			return true; 
		} else {
			return false; 
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Rectangle name = new Rectangle(4, 5, 20, 18);
		System.out.println(name.area);
		
	}
}
