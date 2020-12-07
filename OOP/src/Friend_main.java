// 영진직업전문학교 (사물인터넷)IoT개발과 스마트팩토리 전기제어 임베디드 SW엔지니어 과정
// 이름 : 황주원
// 제출일 : 2020. 12. 04
// 과제명 : 객체지향프로그래밍언어활용하기(생성자)

import java.util.Scanner;

class Friend{
	private String name, addr, pnum;
	public Friend(String name, String addr, String pnum) {
		this.name=name;
		this.addr=addr;
		this.pnum=pnum;
	}
	void showdata() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("번호 : " + pnum);
	}
}

class Friend_io{
	private Friend[] io;
	private int count;
	
	public Friend_io(int i){
		io = new Friend[i];
		count = 0;
	}

	void input() {
		String name, addr, pnum;
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("주소 : ");
		addr = in.next();
		System.out.print("번호 : ");
		pnum = in.next();
		
		io [count++] = new Friend(name, addr, pnum);
		
	}
	void print() {
		for(int i=0; i<count; i++) {
			io[i].showdata();
		System.out.println();
		}
	}
}

public class Friend_main {

	public static void main(String[] args) {
		Friend_io exam = new Friend_io(10);
		Scanner in = new Scanner(System.in);
		boolean bool = true;
		
		while(bool){
			exam.input();
			System.out.print("계속할까요?(Y,N) : ");
			String yn = in.next();
			if(yn.equals("Y") || yn.equals("y"))
				bool=true;
			else if(yn.equals("N") || yn.equals("n"))
				bool=false;
			else {
				System.out.println("잘못된 입력입니다. 종료합니다.");
				break;}
			}
		exam.print();
	}

}
