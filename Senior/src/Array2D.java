import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] subject = {"����", "����", "����"}; // ���� 3�� �迭����
		System.out.print("�ο� �� �Է��ϼ���.");
		int [] n = new int[in.nextInt()]; // n= �ο���
		String [] name = new String[n.length];
		int [][] result = new int[n.length][subject.length];
		int [] sum = new int[n.length];
		float [] avg = new float[n.length]; 
		for(int i=0; i<n.length; i++)
		{
			System.out.print(i+1 + "��° ��� �̸� �Է��ϼ���.");
			name[i] = in.next(); // name�� �̸��� �Է¹޴´�.
			for(int j=0; j<subject.length; j++)
			{
				System.out.print(subject[j] + "���� = ");
				result[i][j] = in.nextInt();
				sum[i] += result[i][j];
			}
			avg[i] = sum[i] / n.length;
		}
		System.out.printf("%s %5s %5s %5s %5s %5s\n", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("============================================");
		for(int k=0; k<n.length; k++)
		{
			System.out.printf("%s %4d�� %4d�� %4d�� %4d�� %6.2f��\n", name[k], result[k][result[k].length -3], result[k][result[k].length -2], result[k][result[k].length -1], sum[k], avg[k]);
		}

	}

}
