// Print "Jay Ganesh" as per user demand

#include<iostream>
using namespace std;

void Display(int iNo)
{
    int iCnt = 0;

    // filter
    if(iNo < 0)
    {
        cout<<"Invalid input";
        return;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        cout<<"Jay Ganesh...\n";
    }
}

int main()
{
    int iValue = 0;
    
    cout<<"Enter frequency :\n";
    cin>>iValue;

    Display(iValue);

    return 0;
}