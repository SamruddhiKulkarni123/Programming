// Program to check whether number is even or odd

#include<iostream>
using namespace std;

bool CheckEvenOdd(int iNo)
{
    int iRemender = 0;

    iRemender = iNo % 2;

    if(iRemender == 0)
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
    
    cout<<"Enter a number : ";
    cin>>iValue;

    bRet = CheckEvenOdd(iValue);

    if(bRet == true)
    {
        cout<<iValue<<" is even\n";
    }
    else
    {
        cout<<iValue<<" is Odd\n";
    }

    return 0;
}
