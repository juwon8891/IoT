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
		System.out.print("좌석을 선택하세요. 종료는(-1)");
		seat2[k]=in.nextInt()-1;
		if(seat2[k]>=0 && seat2[k]<10)
		{	if (seat[seat2[k]]==1) 
			System.out.println("이미 예약된 좌석입니다.");
			if (seat[seat2[k]]==0)
			System.out.println("예약되었습니다.");
			seat[seat2[k]]=1;
			k++;
		}
		}while (seat2[k]!=-2);
		System.out.println("종료합니다.");
/*		 * seat2[k]=in.nextInt(); seat[k]=1; if(seat[k] == 0)
		 * System.out.println("예약되었습니다."); else if(seat[k] == 1) {
		 * System.out.println("이미 예약된 좌석입니다."); continue; } else
		 * System.out.println("종료합니다."); break; }
		 */
		}
}