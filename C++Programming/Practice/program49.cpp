// Accept number from user and check whether number is perfect or not

#include<iostream>
using namespace std;

bool CheckPerfect(int iNo)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }

        if(iSum > iNo)
        {
            break;
        }
    }

    if(iSum == iNo)
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

    cout<<"Enter number : ";
    cin>>iValue;

    bRet = CheckPerfect(iValue);

   if(bRet == true)
   {
        cout<<"Number is perfect\n";
   }
   else
   {
        cout<<"Number is not perfect\n";
   }

    return 0;
}


// Time complexity : O(n/2)
// where n >= 0