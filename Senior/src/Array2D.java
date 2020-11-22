import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] subject = {"국어", "영어", "수학"}; // 과목 3개 배열생성
		System.out.print("인원 수 입력하세요.");
		int [] n = new int[in.nextInt()]; // n= 인원수
		String [] name = new String[n.length];
		int [][] result = new int[n.length][subject.length];
		int [] sum = new int[n.length];
		float [] avg = new float[n.length]; 
		for(int i=0; i<n.length; i++)
		{
			System.out.print(i+1 + "번째 사람 이름 입력하세요.");
			name[i] = in.next(); // name에 이름을 입력받는다.
			for(int j=0; j<subject.length; j++)
			{
				System.out.print(subject[j] + "점수 = ");
				result[i][j] = in.nextInt();
				sum[i] += result[i][j];
			}
			avg[i] = sum[i] / n.length;
		}
		System.out.printf("%s %5s %5s %5s %5s %5s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("============================================");
		for(int k=0; k<n.length; k++)
		{
			System.out.printf("%s %4d점 %4d점 %4d점 %4d점 %6.2f점\n", name[k], result[k][result[k].length -3], result[k][result[k].length -2], result[k][result[k].length -1], sum[k], avg[k]);
		}

	}

}
