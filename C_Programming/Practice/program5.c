// Program to check whether number is even or odd

#include<stdio.h>

void CheckEvenOdd(int iNo)
{
    int iRemender = 0;

    iRemender = iNo % 2 ;

    if(iRemender == 0)
    {
        printf("Number is even");
    }
    else
    {
        printf("Number is odd");
    }

}

int main()
{
    int iValue = 0;
    
    printf("Enter number : ");
    scanf("%d",&iValue);

    CheckEvenOdd(iValue);

    return 0;
}