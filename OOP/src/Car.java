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
	System.out.println("����: " + color + " �ӵ�: " + speed + " ���: "
	 + gear); }
}
