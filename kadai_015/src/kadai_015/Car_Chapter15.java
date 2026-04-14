package kadai_015;

public class Car_Chapter15 {
//フィールド（内部データ）
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	public void changeGear (final int afterGear) {
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		gear=afterGear;
		if((1<=gear)&&(gear<=5)) {
			speed=gear*10;
		}else {
			speed=10;
		}
	}
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}
			
}
