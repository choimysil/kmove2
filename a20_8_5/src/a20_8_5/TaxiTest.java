package a20_8_5;
//상속 실습
class Car {
	protected String model;
	protected String color;
	public Car() {}
	public Car(String model,String color) {
		this.model=model;
		this.color=color;
	}
	public void show() {
		System.out.println("모델명="+model+",칼라="+color);
	}
}

class Taxi extends Car {
	private Boolean TaxiMeter;
	private int TaxiFare=3300;
	public Taxi() {
		super();
	}
	public Taxi(Boolean taxiMeter, int taxiFare) {
		super();
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	public Taxi(String model, String color) {
		super(model, color);
	}
	public Taxi(String model, String color, Boolean taxiMeter, int taxiFare) {
		super(model, color);
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	public void show() {
		super.show();
		System.out.println("택시메타기:"+TaxiMeter+"칼라:"+TaxiFare);
	}
}

public class TaxiTest {
	public static void main(String[] args) {
		Taxi t=new Taxi();
		t.show();
		Taxi t2=new Taxi(true, 3300);
		t2.show();
		
		Car c2=new Car("모닝", "흰색");
		c2.show();
		
		Car c4=new Taxi("소나타","회색", true, 3300);
		c4.show();
		
	}

}
