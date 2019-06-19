#include <stdio.h>
int main() {
  int n, i=1, j=1;
  scanf("%d",&n);
	while(i<=n)
  {
      
      if(j%2==1)
      { printf("%d\n",j);
       j++;
      i++;
      }
      else
        j++;
    }
    
	return 0;
}