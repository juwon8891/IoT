public class Car {
	String color;
	int speed;
	int gear;

	Car(String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}

	void print() { 
	System.out.println("색상: " + color + " 속도: " + speed + " 기어: "
	 + gear); }
}
