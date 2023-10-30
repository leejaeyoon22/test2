/*
2022/07/19
백준 직사각형에서 탈출 문제
한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고,
왼족 아래 꼭짓점은(0, 0), 오른쪽 위 꼭짓점은 (w,h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
*/
#include <iostream>

using namespace std;

int main()
{
    int x, y, w, h;
    int min1, min2, result;
    
    cin >> x >> y >> w >>h;
    
    if(x < y)
        min1 = x;
    else
        min1 = y;
    
    if(w - x < h - y)
        min2 = w - x;
    else
        min2 = h - y;
    
    if(min1 < min2)
        result = min1;
    else
        result = min2;

    cout << result << "\n";

    return 0;
}