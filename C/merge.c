#include <stdio.h>
#include <stdlib.h>

void mergesort(int c[],int low,int mid,int high);
void mergepart(int b[],int low,int high);

void main()
{
  int a[5] = {4,1,21,2,8};
  int size = sizeof(a)/sizeof(int);
  int i = 0;

  printf("the size of array a is: %d", size);

  mergepart(a, 0, size-1);
  printf("\nThe sorted array is: ");
  for (i = 0; i < size; i++)
  {
    printf("%d ", a[i]);
  }
  printf("\n");
}

void mergepart(int b[], int low, int high)
{
  if (low < high)
  {
    int mid = (low + high)/2;
    mergepart(b, low, mid);
    mergepart(b, mid+1, high);
    mergesort(b, low, mid, high);
  }
}

void mergesort(int c[], int low, int mid, int high)
{
  int i,m,k,l,temp[5];
  m = mid + 1;
  l = low;
  i = low;

  while((l <= mid) && (m <= high))
  {
    if (c[l] <= c[m])
    {
          temp[i] = c[l];
          l++;
    }
    else
    {
        temp[i] = c[m];
        m++;
    }
    i++;
  }
  if(l > mid)
  {
         for(k=m;k<=high;k++){
             temp[i]=c[k];
             i++;
         }
  }
  else{
         for(k=l;k<=mid;k++){
             temp[i] = c[k];
             i++;
         }
  }

  for(k=low;k<=high;k++){
         c[k]=temp[k];
    }
}
