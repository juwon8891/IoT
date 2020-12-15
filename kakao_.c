#include <stdio.h>

int main() {
    int a[20][20] = { 0 };
    int num = 0, x = 0, y = 0;
    int i, k, j;
    int size, now = 1;

    printf("크기를 입력해주세요 : ");
    scanf("%d", &size);
    for (j = 0; j < size / 2; j++) {
        for (k = 0; k < size - 2 * num; k++) {
            a[x][y++] = now++;
        }
        x += 1, y -= 1;
        for (k = 0; k < size - 2 * num - 1; k++) {
            a[x++][y] = now++;
        }
        x -= 1, y -= 1;
        for (k = 0; k < size - 2 * num - 1; k++) {
            a[x][y--] = now++;
        }
        x -= 1, y += 1;
        for (k = 0; k < size - 2 * num - 2; k++) {
            a[x--][y] = now++;
        }
        x += 1, y += 1, num++;
    }
    if (size % 2 == 1 && size*size == now){
        a[x][y] = now;
    }
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            printf("%3d ", a[i][j]);
        }
        printf("\n\n");
    }
    printf("%d", now);
    return 0;
}
