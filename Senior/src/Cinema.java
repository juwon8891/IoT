import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] seat = new int[10];
		int [] seat2 = new int[10];
		int k = 0;
		String yn;
		do
		{
		System.out.print("============================\n1");
		for(int i=0; i<9; i++)
		System.out.printf("%3d", i+2);
		System.out.println();
		for(int d=0; d<seat.length; d++)
		System.out.printf("%-3d", seat[d]);
		System.out.println();
	    System.out.println("============================");
		System.out.print("�¼��� �����ϼ���. �����(-1)");
		seat2[k]=in.nextInt()-1;
		if(seat2[k]>=0 && seat2[k]<10)
		{	if (seat[seat2[k]]==1) 
			System.out.println("�̹� ����� �¼��Դϴ�.");
			if (seat[seat2[k]]==0)
			System.out.println("����Ǿ����ϴ�.");
			seat[seat2[k]]=1;
			k++;
		}
		}while (seat2[k]!=-2);
		System.out.println("�����մϴ�.");
/*		 * seat2[k]=in.nextInt(); seat[k]=1; if(seat[k] == 0)
		 * System.out.println("����Ǿ����ϴ�."); else if(seat[k] == 1) {
		 * System.out.println("�̹� ����� �¼��Դϴ�."); continue; } else
		 * System.out.println("�����մϴ�."); break; }
		 */
		}
}