#include <stdio.h>
int main() {
  int n, t, rev=0, k;
  scanf("%d",&n);
while(n>0)
{
  t=n%10;
  rev=rev*10+t;
  n=n/10;
}
  rev=rev/10;
  k=rev%10;
  printf("%d",k);
	return 0;
}