#include <stdio.h>
int main(void) {
	int arr[3][3] = {
		{1,2,3},
		{1,2,3},
		{1,2,3}
	};
	int arr1[3][3][3] = { 
		{ 
			{1,2,3}, 
			{1,2,3},
			{1,2,3} 
		}, 
		{ 
			{4,5,3},
			{1,2,3},
			{1,2,3} 
		}, 
		{ 
			{7,2,3},
			{1,8,3},
			{1,99,3} 
		} 
	};

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				printf("3차원 배열 arr1[%d][%d][%d]의 값 %d\n", i, j, k, arr1[i][j][k]);
			} printf("\n");
		} printf("\n");
	}

	return 0;
}