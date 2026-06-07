// Program to check whether number is even or odd

#include<stdio.h>

int CheckEvenOdd(int iNo)
{
    int iRemender = 0;

    iRemender = iNo % 2 ;

    return iRemender;

}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number to check whether it is even or odd : ");
    scanf("%d",&iValue);

    iRet = CheckEvenOdd(iValue);

    if(iRet == 0)
    {
        printf("%d is even",iValue);
    }
    else
    {
        printf("%d is odd",iValue);
    }

    return 0;
}