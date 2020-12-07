class BankAccounter {
	private String OwnerName;
	private int accountNumber;
	private int balance;
	private double Rate;
	
	public String getOwnerName() { 
		return this.OwnerName; 
		} 
	public void setOwnerName(String OwnerName) {
		this.OwnerName=OwnerName; 
		}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getRate() {
		return Rate;
	}
	public void setRate(double Rate) {
		this.Rate = Rate;
	}
	public BankAccounter() {}
	public BankAccounter(String OwnerName, int accountNumber, int balance, double Rate) {
		this.OwnerName = OwnerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.Rate = Rate;
	}
	public String toString() {
		return "BankAccounter [OwnerName=" + OwnerName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", Rate=" + Rate + "]";
	}
	void print() {
		System.out.println(toString());
	}
}
public class Banking_0 {

	public static void main(String[] args) {
		BankAccounter bank = new BankAccounter("황주원", 100, 200, 0.1);
		BankAccounter bank2 = new BankAccounter();
		
		bank2.setOwnerName("주원");
		bank2.setAccountNumber(200);
		bank2.setBalance(100);
		bank2.setRate(0.2);
		bank.print();
		bank2.print();
	}

}
