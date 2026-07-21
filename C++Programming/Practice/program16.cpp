// Calculation of ticket price on the basis of age

#include<iostream>
using namespace std;

#define AGE_INVALID -1

int CalculateTicketPrice(int iAge)
{
    // Input filter
    if(iAge < 0)
    {
        return AGE_INVALID;
    }
    
    if((iAge >= 0) && (iAge <= 5))
    {
        return 0;
    }
    else if((iAge >= 6) && (iAge <= 18))
    {
        return 500;
    }
    else if((iAge >= 19) && (iAge <= 50))
    {
        return 900;
    }
    else
    {
        return 400;
    }

}
int main()
{
    int iValue = 0;
    int iRet = 0;

    cout<<"Enter age to calculate ticket price : ";
    cin>>iValue;

    iRet = CalculateTicketPrice(iValue);

    if(iRet == AGE_INVALID)
    {
        cout<<"Please enter positive age"<<endl;
    }
    else
    {
        cout<<"Your ticket price is : "<<iRet<<endl;

    }
    
    return 0;
}