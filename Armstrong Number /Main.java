#include <stdio.h>
int main() {
	int x, n, l, k=0, tn, j, a=0, g;
  scanf("%d",&n);
  tn=n;
  x=n;
  while(tn>0)
  {
    k++;
    tn=tn/10;
  }
  while(n>0)
  {
    g=n%10;
    j=1;
    for(int i=1;i<=k;i++)
    { j=j*g;   }
    a=a+j;
    n=n/10;
  }
  if(x==a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    
  
	return 0;
}