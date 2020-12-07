import java.util.Scanner;
class Bank_Data{
	private String Account_number;
	private String Name;
	private double First_Deposit;

public String getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(String account_number) {
		Account_number = account_number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getFirst_Deposit() {
		return First_Deposit;
	}

	public void setFirst_Deposit(double first_Deposit) {
		First_Deposit = first_Deposit;
	}
	
	void showdata() {
		System.out.printf(getAccount_number() + "\t");
		System.out.printf(getName() + "\t");
		System.out.printf(getFirst_Deposit() + "\n");
	}
}
class Account_Data{

	Scanner in = new Scanner(System.in);
	Bank_Data Create[] = new Bank_Data[100];
	int count = 0;
	void Account_create() {
		String Account_number;
		String Name;
		double First_Deposit;
		System.out.print("���¹�ȣ: ");
		Account_number=in.next();
		System.out.print("������: ");
		Name=in.next();
		System.out.print("�ʱ� �Աݾ�: ");
		First_Deposit=in.nextDouble();
		if(findAccount(Account_number)!=null&&findAccount(Account_number).getAccount_number().equals(Account_number))
			System.out.println("�ߺ��� ���¹�ȣ�� �ֽ��ϴ�.");
		else {
		Create[count] = new Bank_Data();
		Create[count].setAccount_number(Account_number);
		Create[count].setName(Name);
		Create[count].setFirst_Deposit(First_Deposit);
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		count++;}
	}
	void select() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3. ���� | 4.��� | 5.����");
		System.out.println("--------------------------------------------------------------");
		System.out.print("����> ");
	}
	void show_list() {
		System.out.println("----------------------");
		System.out.println("���¸��");
		System.out.println("----------------------");
		for(int i=0; i<count; i++)
		Create[i].showdata();
	}
	void deposit() {
		System.out.println("----------------------");
		System.out.println("����");
		System.out.println("----------------------");
		System.out.print("���¹�ȣ: ");
		String Check_Number = in.next();
		System.out.print("�Աݾ�: ");
		double sum_money = in.nextDouble();
		if(findAccount(Check_Number) == null)
			System.out.println("�Է��� ���¸� ã�� ���Ͽ����ϴ�.");
		else {
			findAccount(Check_Number).setFirst_Deposit(findAccount(Check_Number).getFirst_Deposit() + sum_money);
			System.out.println("���: �Ա��� �Ϸ� �Ͽ����ϴ�.");
		}
	}
	void Withdrawal() {
		System.out.println("----------------------");
		System.out.println("���");
		System.out.println("----------------------");
		System.out.print("���¹�ȣ: ");
		String Check_Number = in.next();
		System.out.print("��ݾ�: ");
		double sub_money = in.nextDouble();
		if(findAccount(Check_Number) == null)
			System.out.println("�Է��� ���¸� ã�� ���Ͽ����ϴ�.");
		else {
			findAccount(Check_Number).setFirst_Deposit(findAccount(Check_Number).getFirst_Deposit() - sub_money);
			System.out.println("���: ����� �Ϸ� �Ͽ����ϴ�.");
	}
		
		
	}
	public Bank_Data findAccount(String Check_Number) {
		for (int i = 0; i < Create.length; i++) {
			if (Create[i] == null) {
				break;
			}
			if (Create[i].getAccount_number().equals(Check_Number)) {
				return Create[i];
			}
		}
		return null;
	}
}

public class Bank_System {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account_Data handler = new Account_Data();
		boolean bool=true;
		
		while(bool) {
		handler.select();
		int num = in.nextInt();
		switch(num) {
		case 1:	
		{
			handler.Account_create();
			break;
	
		}
		case 2:
		{
			handler.show_list();
			break;
		}
		case 3:
			handler.deposit();
			break;
		case 4:
			handler.Withdrawal();
			break;
		case 5:
			bool=false;
			System.out.println("�����մϴ�!");
			break;
		}
		}
	}

}
