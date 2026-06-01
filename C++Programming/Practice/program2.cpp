// Program to perforrm addition of two integers

#include<iostream>
using namespace std;

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    cout<<"Enter first number:";
    cin>>iValue1;

    cout<<"Enter second number:";
    cin>>iValue2;

    iRet = iValue1 + iValue2;

    cout<<"Addition is:"<<iRet;

    return 0;

}