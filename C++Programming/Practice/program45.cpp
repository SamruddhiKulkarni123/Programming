// Accept number from user and calculate sum of its factors

#include<iostream>
using namespace std;

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

    cout<<"Sum of factors is : "<<iSum<<endl;

}

int main()
{
    int iValue = 0;

    cout<<"Enter number : ";
    cin>>iValue;

    SumFactors(iValue);

    return 0;
}


// Time complexity : O(n/2)
// where n >= 0