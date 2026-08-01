// check whether no is divisible by 3 and 5

#include<stdio.h>

void CheckDivisible(int iNo)
{
    if((iNo % 3 == 0) && (iNo % 5 == 0))
    {
        printf("Number is divisible by 3 and 5\n");
    }
    else
    {
        printf("Number is not divisible by 3 and 5\n");
    }


}
int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    CheckDivisible(iValue);
    
    return 0;
}