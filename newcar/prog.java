package newcar;
class Car {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	Car(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	
	Car() {
		this("�ҳ�Ÿ", 2012, "������", 160);	// �ٸ� �����ڸ� ȣ����.
	}
	
	public String getModel() {
		return this.modelYear + "��� " + this.modelName + " " + this.color;
	}
}


public class prog {
	public static void main(String[] args) {
		Car tcpCar = new Car("���������", 2011, "���", 1);
		System.out.println(tcpCar.getModel());
		Car tcfCar = new Car();
		System.out.println(tcfCar.getModel());
	}
}