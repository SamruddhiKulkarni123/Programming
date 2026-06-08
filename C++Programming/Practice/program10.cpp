// Program to check whether number is even or odd

#include<iostream>
using namespace std;

class NumberX
{
    public :

        bool CheckEvenOdd(int iNo)
        {
            if(iNo % 2 == 0)
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
    
    cout<<"Enter a number : ";
    cin>>iValue;

    NumberX nobj;

    bRet = nobj.CheckEvenOdd(iValue);

    if(bRet)
    {
        cout<<iValue<<" is even\n";
    }
    else
    {
        cout<<iValue<<" is Odd\n";
    }

    return 0;
}
