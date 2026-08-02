// Check whether number is divisible by 3 and 5

#include<iostream>
using namespace std;

class NumberX
{
    public :
        bool Divisible(int iNo)
        {
            if((iNo % 3 == 0) && (iNo % 5 == 0))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
};

int main()
{
    int iValue = 0;
    bool bRet = false;

    cout<<"Enter number:";
    cin>>iValue;

    NumberX nobj;

    bRet = nobj.Divisible(iValue);

    if(bRet == true)
    {
        cout<<"Number is divisible by 3 and 5"<<endl;
    }
    else
    {
        cout<<"Number is not divisible by 3 and 5"<<endl;
    }

    return 0;
}