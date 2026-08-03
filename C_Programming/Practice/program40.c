// Accept number from user and calculate sum of its factors

#include<stdio.h>

void SumFactors(int iNo)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }
    }

    printf("Sum of factors is : %d\n",iSum);

}
int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    SumFactors(iValue);


    return 0;
}

// Time complexity : O(n/2)
// where n >= 0