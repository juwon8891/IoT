import java.util.Scanner;
class Friend_exam {
	String name, phoneNum, addr;
	public Friend_exam(String name, String phoneNum, String addr) {
		this.name=name;
		this.phoneNum=phoneNum;
		this.addr=addr;
	}
	public void showData() {
		System.out.println("�̸� : " +  name);
		System.out.println("��ȭ��ȣ : " +  phoneNum);
		System.out.println("�ּ� : " +  addr);
	}
}


class FriendInfoHead { // �ڷ� �Է�, ����, ��� �ϱ� ���� ����� ���� Ŭ����
	private Friend_exam[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHead(int num) {
		myFriends = new Friend_exam[num];
		numOfFriends = 0;
	}
	
	public void addFriend() {
		String name, phoneNum, addr;
		
		Scanner in = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = in.next();
		System.out.print("��ȭ : ");
		phoneNum = in.next();
		System.out.print("�ּ� : ");
		addr = in.next();
		
		myFriends[numOfFriends++]= new Friend_exam(name, phoneNum, addr);
		System.out.println("�Է¿Ϸ�! \n");
		
	}
	
	public void showAlldata() {
		for(int i=0; i<numOfFriends; i++) {
		myFriends[i].showData();
		System.out.println();
		}
	}
}


public class FriendInfo {

	public static void main(String[] args) {
		FriendInfoHead handler = new FriendInfoHead(10);
		boolean flags = true;
		while (flags) {
			handler.addFriend();
			System.out.print("����ұ��?(Y/N) : ");
			Scanner in = new Scanner(System.in);
			String nextin = in.next();
			
			if(nextin.equals("N") || nextin.equals("n")) flags=false;
			
		}
		handler.showAlldata();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
