import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Baseball 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int[] A= new int[3];
		int[] B= new int[3];
		int x=0, y=0, z=0, m=0;
		int j, r1, q1=0;
		
		for(j=0; j<3; j++)
		 B[j]= random.nextInt(10);
		System.out.printf("%d %6d %6d\n", B[0], B[1], B[2]);
		do {
		int r=0;
		int q=0;
		m++;
		System.out.printf("세개수를 연속적으로 입력 = "); 
		for(int i=0; i<B.length; i++)
		A[i]=System.in.read()-48;
		System.in.read();
		System.in.read();
		for(int g=0; g<3; g++) {
			if(B[g]==A[g])
				q++;
			else
				r++;
			}
		q1=q;
		r1=r;
		System.out.printf(q + "strike, " + r + "ball! \n");
		} while (q1!=3);
	    System.out.println(m+"번째에 맞추셨습니다!");
			
	}	
}