package a20_8_5;

class Point2D {
	public int x,y;
	public void show() {
		System.out.println("2d쇼");
	}
}
class Point3D extends Point2D{
	public int z;
	public void show() {
		System.out.println("3d쇼");
	}
}
public class castTest1 {
	public static void main(String[] args) {
		Point3D pt=new Point3D();
		Point2D up=pt;  //자식객체를 왼쪽up 부모에게 맡겨요
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);  //에러
		//부모에게 맡긴 자식의 멤버변수는 부모가 사용할 수 없음
		up.show();
	}
}
