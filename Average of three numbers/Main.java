#include<stdio.h>
int main()
{
  //Type your code here
  int a, b, c, sum=0, avg=0;
  scanf("%d %d %d",&a, &b, &c);
  sum=a+b+c;
  avg=sum/3;
  printf("%d",avg);
  return 0;
}