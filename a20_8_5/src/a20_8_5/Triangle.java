package a20_8_5;

public class Triangle extends Shape { //삼각형
	private int w,h;
	public double area() {
		res=(w*h)/2.0;
		return res;
	}
	public void show() {
		System.out.println("삼각형의 넓이="+res);
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
}
