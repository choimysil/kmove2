package a20_8_5;
/*문제)
1) A 클래스 만들기
2) B 클래스 만들기(A 클래스로부터 상속받아서)
3) C 클래스 만들기 (main가짐)
    내부에 B클래스의 객체 b 생성하기*/
class A{
}

class B extends A{
	
}
public class C {
	public static C getC() {
		return new C();
	}
	public static void main(String[] args) {
		A kim=new A();
		B bkim=new B();
		C ckim=new C();    //자신의 클래스를 객체
		C cpark=getC();    //자신의 클래스를 객체화하는 메소드 호출
	}
}
