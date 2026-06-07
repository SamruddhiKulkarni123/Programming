// Program to check whether number is even or odd

#include<stdio.h>

int main()
{
    int iValue = 0;
    int iRemender = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRemender = iValue % 2 ;

    if(iRemender == 0)
    {
        printf("Number is even");
    }
    else
    {
        printf("Number is odd");
    }

    return 0;
}