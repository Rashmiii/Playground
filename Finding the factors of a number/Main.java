#include <stdio.h>
int main() {
	int i, n=0, k;
  scanf("%d", &n);
  for(i=1;i<=n;i++)
  {
    k=n%i;
    if(k==0)
    {printf("%d\n",i);}
  }
	return 0;
}