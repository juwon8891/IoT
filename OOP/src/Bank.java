import java.util.Scanner;

class Banking{
	private String name, accountNumber; 
	private double deposit, Rate, Total;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	 String getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	double getDeposit() {
		return deposit;
	}
	void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	double getRate() {
		return Rate;
	}
	void setRate(double rate) {
		Rate = rate;
	}
	double getTotal() {
		return Total;
	}
	void setTotal(double deposit, double Rate) {
		Total = deposit+(deposit*Rate);
	}
	void showdata() {
		System.out.println("������: " + name);
		System.out.println("���¹�ȣ: " + accountNumber);
		System.out.println("���ݾ�: " + deposit);
		System.out.println("����: " + Rate);
		System.out.println("�������հ�: " + Total);
	}
}

class Account{
	private Banking Bank_data[];
	private int count;
	public Account(int num) {
		Bank_data = new Banking[num];
		count=0;
	}
	void input() {
		String name, accountNumber; 
		double deposit, Rate;
		Scanner in = new Scanner(System.in);
		System.out.print("������ : ");
		name = in.next();
		System.out.print("���¹�ȣ : ");
		accountNumber = in.next();
		System.out.print("���ݾ� : ");
		deposit = in.nextDouble();
		System.out.print("���� : ");
		Rate = in.nextDouble();
		Bank_data[count] = new Banking();
		Bank_data[count].setName(name);
		Bank_data[count].setAccountNumber(accountNumber);
		Bank_data[count].setDeposit(deposit);
		Bank_data[count].setRate(Rate);
		Bank_data[count].setTotal(deposit, Rate);
		count++;
	}
	void print() {
		for(int i=0; i<count; i++) {
			Bank_data[i].showdata();
		System.out.println();
		}
	}
}


public class Bank {

	public static void main(String[] args) {
		Account exam = new Account(10);
		Scanner in = new Scanner(System.in);
		boolean bool = true;
		
		while(bool){
			exam.input();
			System.out.print("����ұ��?(Y,N) : ");
			String yn = in.next();
			if(yn.equals("Y") || yn.equals("y"))
				bool=true;
			else if(yn.equals("N") || yn.equals("n"))
				bool=false;
			else {
				System.out.println("�߸��� �Է��Դϴ�. �����մϴ�.");
				break;}
			}
		exam.print();
		}

}
