#include <stdio.h>
int main() {
	int n, s=0, x,b, k=0,v,f=1;
  scanf("%d",&n);
  x=n;
  b=n;
  while(b>0)
  {
    k++;
    b=b/10;
  }
  for(int i=0;i<k;i++)
  {
    v=n%10;
    f=1;
    for(int j=1;j<=v;j++)
  {
    f=f*j;
  }
    s=s+f;
    n=n/10;
  }
  if(s==x)
  { printf("Yes");}
  else
  {printf("No");}
	return 0;
}