// Check whether number is divisible by 3 and 5

#include<iostream>
using namespace std;

int main()
{
    int iValue = 0;

    cout<<"Enter number:";
    cin>>iValue;

    if((iValue % 3 == 0) && (iValue % 5 == 0))
    {
        cout<<"Number is divisible by 3 and 5"<<endl;

    }
    else
    {
        cout<<"Number is not divisible by 3 and 5"<<endl;
    }

    return 0;
}