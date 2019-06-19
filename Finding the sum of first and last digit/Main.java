#include <stdio.h>
int main() {
	int n, f, l, sum=0, rev=0, t;
  scanf("%d",&n);
  l=n%10;
  while(n>0)
{
  t=n%10;
  rev=rev*10+t;
  n=n/10;
}
  f=rev%10;
  sum=f+l;
  printf("%d",sum);
	return 0;
}