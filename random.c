//#include <time.h>
//#include <stdio.h>
//#include <stdlib.h>
//int main(void)
//{
//	srand(time(NULL)); // ���� �ʱ�ȭ
//	//int num = rand() % 3 + 1; // 1 ~ 3 ������ ���� �̴´�
//
//	printf("���� �ʱ�ȭ ���� \n");
//	for (int i = 0; i < 10; i++)
//	{
//		printf("%d ", rand() % 10 + 1);
//	}
//
//	return 0;
//}
#include <stdio.h>
#include <time.h>
int main(void)
{
	srand(time(NULL));
	int com[10];
	int bool = 1;
	do {
		bool = 0;
		for (int i = 0; i < 6; i++) {
			com[i] = rand()%45+1; // ���� 3���� ���� ����
			for (int j = 0; j < i; j++)
				if (com[i] == com[j])
					bool = 1;
		}
	} while (bool);
	for (int i = 0; i < 6; i++)
		printf("%-5d", com[i]); // ����
}