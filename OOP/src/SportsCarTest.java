class SportsCar
{
	int speed;
	int setSpeed;
	boolean setTurbo;
	SportsCar(boolean setTurbo)
	{
		this.setTurbo=setTurbo;
	}
	}
public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar obj = new SportsCar(false);
		
		obj.speed = 10;
		obj.setSpeed = 20;
		
		System.out.printf("���ǵ�: %d, �½��ǵ�: %d\n�� ���� %s", obj.speed, obj.setSpeed, obj.setTurbo);
	}
}
