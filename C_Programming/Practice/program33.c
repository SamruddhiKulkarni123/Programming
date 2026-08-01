// check whether no is divisible by 3 and 5

#include<stdio.h>

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    if((iValue % 3 == 0) && (iValue % 5 == 0))
    {
        printf("Number is divisible by 3 and 5\n");
    }
    else
    {
        printf("Number is not divisible by 3 and 5\n");
    }

    return 0;
}