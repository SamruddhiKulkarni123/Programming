// Program to check whether number is even or odd

#include<iostream>
using namespace std;

void CheckEvenOdd(int iNo)
{
    int iRemender = 0;

    iRemender = iNo % 2;

    if(iRemender == 0)
    {
        cout<<iNo<<" is even\n";
    }
    else
    {
        cout<<iNo<<" is Odd\n";
    }

}
int main()
{
    int iValue = 0;
    
    cout<<"Enter a number : ";
    cin>>iValue;

    CheckEvenOdd(iValue);

    return 0;
}
