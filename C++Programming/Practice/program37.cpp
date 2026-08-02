// Check whether number is divisible by 3 and 5

#include<iostream>
using namespace std;

void Divisible(int iNo)
{
    if((iNo % 3 == 0) && (iNo % 5 == 0))
    {
        cout<<"Number is divisible by 3 and 5"<<endl;

    }
    else
    {
        cout<<"Number is not divisible by 3 and 5"<<endl;
    }
}
int main()
{
    int iValue = 0;

    cout<<"Enter number:";
    cin>>iValue;

    Divisible(iValue);

    return 0;
}