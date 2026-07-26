// Take name, age and marks from user and display it on screen

#include<iostream>
using namespace std;

class Information
{
    public :

        char *Arr;
        int age;
        float marks;

        Information(char *A,  int Age, float Marks)
        {
            this-> Arr = A;
            this-> age = Age;
            this->marks = Marks;
        }

        void Display()
        {
            cout<<"Name : "<<Arr<<endl;
            cout<<"Age : "<<age<<endl;
            cout<<"Marks : "<<marks<<endl;

        }

};

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

    Information iobj(cArr, iAge, fMarks);

    iobj.Display();

    
    return 0;
}