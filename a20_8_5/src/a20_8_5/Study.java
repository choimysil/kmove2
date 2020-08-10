package a20_8_5;
public class Study {
	public static void poly(Shape sh) {
		if(sh instanceof Circle ) {
			Circle cx=(Circle) sh;
			cx.setR(5);
			cx.area();
			cx.show();
		}
		else if (sh instanceof Rectangle) {
			Rectangle rx=(Rectangle) sh;
			rx.setW(5);
			rx.setH(10);
			rx.area();
			rx.show();
		}
		else if (sh instanceof Triangle)  {
			Triangle tx=(Triangle) sh;
			tx.setH(5);
			tx.setW(10);
			tx.area();
			tx.show();
		}
	}
}
