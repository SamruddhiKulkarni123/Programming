// Program to check whether number is even or odd

#include<iostream>
using namespace std;

int CheckEvenOdd(int iNo)
{
    int iRemender = 0;

    iRemender = iNo % 2;

    return iRemender;

}
int main()
{
    int iValue = 0;
    int iRet = 0;
    
    cout<<"Enter a number : ";
    cin>>iValue;

    iRet = CheckEvenOdd(iValue);

    if(iRet == 0)
    {
        cout<<iValue<<" is even\n";
    }
    else
    {
        cout<<iValue<<" is Odd\n";
    }

    return 0;
}
