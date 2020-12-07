//#include <time.h>
//#include <stdio.h>
//#include <stdlib.h>
//int main(void)
//{
//	srand(time(NULL)); // 난수 초기화
//	//int num = rand() % 3 + 1; // 1 ~ 3 사이의 수를 뽑는다
//
//	printf("난수 초기화 이전 \n");
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
			com[i] = rand()%45+1; // 랜덤 3개의 숫자 생성
			for (int j = 0; j < i; j++)
				if (com[i] == com[j])
					bool = 1;
		}
	} while (bool);
	for (int i = 0; i < 6; i++)
		printf("%-5d", com[i]); // 랜덤
}