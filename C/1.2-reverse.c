// Program to reverse a null terminated string
#include <stdio.h>
#include <string.h>

void reverse(char *);

void main()
{
  char test[] = "YogeshRane";
  reverse(test);
}

void reverse(char *a)
{
  char temp;
  char* end = a;
  char* start = a;

  if (a)
  {
    while (*end)
    {
      ++end; //Size of end is char so ++ works(I guess)
    }

    --end; //To remove the null character
    //start = end;
    /* Now start swapping characters from start of string with the
    * end of string, until pointers meet in MIDDLE */

    while (a < end)
    {
      temp = *a;
      *a++ = *end;
      *end-- = temp;
    }
    a = start;
    printf("The reversed string is: %s\n", a);
  }
}
