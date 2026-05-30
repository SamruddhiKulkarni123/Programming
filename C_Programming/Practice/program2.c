// Program to perforrm addition of two integers

#include<stdio.h>

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    printf("Enter first number:");
    scanf("%d",&iValue1);

    printf("Enter second number:");
    scanf("%d",&iValue2);

    iRet = iValue1 + iValue2;

    printf("Addition is : %d",iRet);

    return 0;
}