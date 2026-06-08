// Program to check whether number is even or odd

#include<iostream>
using namespace std;

int main()
{
    int iValue = 0;
    int iRemender = 0;

    cout<<"Enter a number : ";
    cin>>iValue;

    iRemender = iValue % 2;

    if(iRemender == 0)
    {
        cout<<iValue<<" is even\n";
    }
    else
    {
        cout<<iValue<<" is Odd\n";
    }

    return 0;
}
