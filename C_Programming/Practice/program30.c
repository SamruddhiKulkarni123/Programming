// Take name, age and marks from user and display it on screen

#include<stdio.h>

void Display(char *Arr, int age, float marks)
{
    printf("Name : %s\n",Arr);
    printf("Age : %d\n", age);
    printf("Marks : %f\n",marks);
}
int main()
{
    char cArr[20] = {'\0'};
    int iAge = 0;
    float fMarks = 0.0f;

    printf("Enter your name : ");
    scanf("%s",cArr);

    printf("Enter your age : ");
    scanf("%d",&iAge);

    printf("Enter your marks : ");
    scanf("%f",&fMarks);

    Display(cArr, iAge, fMarks);


    return 0;
}