// �������������б� (�繰���ͳ�)IoT���߰� ����Ʈ���丮 �������� �Ӻ���� SW�����Ͼ� ����
// �̸� : Ȳ�ֿ�
// ������ : 2020. 12. 04
// ������ : ��ü�������α׷��־��Ȱ���ϱ�(������)

import java.util.Scanner;

class Friend{
	private String name, addr, pnum;
	public Friend(String name, String addr, String pnum) {
		this.name=name;
		this.addr=addr;
		this.pnum=pnum;
	}
	void showdata() {
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + addr);
		System.out.println("��ȣ : " + pnum);
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
		System.out.print("�̸� : ");
		name = in.next();
		System.out.print("�ּ� : ");
		addr = in.next();
		System.out.print("��ȣ : ");
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
