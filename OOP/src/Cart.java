class nw2 {
	int gasolineGauge;
}

class HybridCar extends nw2{
	int electricGague;
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	public void showCurrentGauge(){
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGague);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}
public class Cart {

	public static void main(String[] args)
	{
		HybridWaterCar h = new HybridWaterCar();
		h.gasolineGauge = 4;
		h.electricGague = 2;
		h.waterGauge = 5;
		h.showCurrentGauge();
	}
 }