#include<stdio.h>
int main()
{
  //Type your code here
  int i, n1, n2, sum=0;
  scanf("%d", &i);
  n1=i%10;
  n2=i/10;
  sum=n1+n2;
  printf("%d",sum);
  return 0;
}