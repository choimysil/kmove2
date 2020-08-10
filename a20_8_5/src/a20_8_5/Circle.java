package a20_8_5;

public class Circle extends Shape {  //원
	private int r;
	public double area() {
		res=r*r*Math.PI;
		return res;
	}
	public void show() {
		System.out.println("원넓이="+res);
	}
	public void setR(int r) {
		this.r = r;
	}
	

}
