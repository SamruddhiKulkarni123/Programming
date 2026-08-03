// Accept number from user and display its factors

#include<iostream>
using namespace std;

class NumberX
{
    public :
        void DisplayFactors(int iNo)
        {
            int iCnt = 0;

            for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    cout<<iCnt<<endl;
                }
            }

        }
};

int main()
{
    int iValue = 0;

    cout<<"Enter number : ";
    cin>>iValue;

    NumberX nobj;

    nobj.DisplayFactors(iValue);

    return 0;
}


// Time complexity : O(n/2)
// where n >= 0