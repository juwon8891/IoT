# IoT
Iot
#include <stdio.h>
int SimA(int answer, int i)
{
	int result = 0;
	int a[5] = { 1,2,3,4,5 };
	int* ptra = &a[0];
	int count=0;
	if (i >= 5)
		for (int j = 0; j < 5; j++)
			i = j;
		if (answer == a[i]){
			count++;
			return 1;
		}
			
		else {
			count++;
			return 0;
		}
				


}

int main(void)
{
	int result = 0;
	int answer[7] = { 1,2,3,4,5,1,2 };
	int* ptrA = answer;
	for (int i = 0; i < 6; i++)
		result += SimA(answer[i], i);
	

	printf("결과 : %d \n", result);
	return 0;
}
