import java.util.Scanner;
class Friend_exam {
	String name, phoneNum, addr;
	public Friend_exam(String name, String phoneNum, String addr) {
		this.name=name;
		this.phoneNum=phoneNum;
		this.addr=addr;
	}
	public void showData() {
		System.out.println("이름 : " +  name);
		System.out.println("전화번호 : " +  phoneNum);
		System.out.println("주소 : " +  addr);
	}
}


class FriendInfoHead { // 자료 입력, 저장, 출력 하기 위한 기능을 가진 클래스
	private Friend_exam[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHead(int num) {
		myFriends = new Friend_exam[num];
		numOfFriends = 0;
	}
	
	public void addFriend() {
		String name, phoneNum, addr;
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("전화 : ");
		phoneNum = in.next();
		System.out.print("주소 : ");
		addr = in.next();
		
		myFriends[numOfFriends++]= new Friend_exam(name, phoneNum, addr);
		System.out.println("입력완료! \n");
		
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
			System.out.print("계속할까요?(Y/N) : ");
			Scanner in = new Scanner(System.in);
			String nextin = in.next();
			
			if(nextin.equals("N") || nextin.equals("n")) flags=false;
			
		}
		handler.showAlldata();
		System.out.println("프로그램을 종료합니다.");

	}

}
