// check whether no is divisible by 3 and 5

#include<stdio.h>
#include<stdbool.h>

bool CheckDivisible(int iNo)
{
    if((iNo % 3 == 0) && (iNo % 5 == 0))
    {
        return true;
    }
    else
    {
        return false;
    }


}
int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    bRet = CheckDivisible(iValue);

    if(bRet == true)
    {
        printf("Number is divisible by 3 and 5\n");
    }
    else
    {
        printf("Number is not divisible by 3 and 5\n");
    }
    
    return 0;
}