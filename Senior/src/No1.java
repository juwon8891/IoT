import java.util.Scanner;

public class No1 {
	
	public static int max(int a, int b) {
		return (a > b) ? a: b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("입력");
		int number = in.nextInt();
		int[] array = new int[number];
		for(int i=0; i<number; i++) {
			System.out.print("정수입력");
			array[i]= in.nextInt();}
			int result = -1;
		for(int i=0; i<number; i++)
		{
			result = max(result, array[i]);
			
		}
		System.out.println("가장 큰값" + result);
	}
}