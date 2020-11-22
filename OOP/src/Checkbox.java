import java.util.Scanner;

public class Checkbox {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] min = new String[13];
		String star = "*";
		do
		{
		for(int i=0; i<13; i++)
		{
			min[i]="x";
		System.out.print(min[i]);
		}
		System.out.println();
		System.out.print("A버튼을 입력하시오.");
		String a = in.next();
		if(a.equals("A") || a.equals("a"))
			for(int j=0; j<4; j++)
			{
				min[j]=star;
			}
			for(int k=0; k<6; k++)
			{
				System.out.print(min[k]);
			}
		System.out.println();
		}while(true);
	

}
}
