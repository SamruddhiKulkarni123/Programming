// Take name, age and marks from user and display it on screen

#include<iostream>
using namespace std;

int main()
{
    char cArr[20] = {'\0'};
    int iAge = 0;
    float fMarks = 0.0f;

    cout<<"Enter your name : \n";
    cin>>cArr;

    cout<<"Enter your Age : \n";
    cin>>iAge;

    cout<<"Enter your marks : \n";
    cin>>fMarks;

    cout<<"Name : "<<cArr<<endl;
    cout<<"Age : "<<iAge<<endl;
    cout<<"Marks : "<<fMarks<<endl;

    return 0;
}