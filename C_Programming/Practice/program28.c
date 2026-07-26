// Take name, age and marks from user and display it on screen

#include<stdio.h>

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

    printf("Name : %s\n",cArr);
    printf("Age : %d\n", iAge);
    printf("Marks : %f\n",fMarks);


    return 0;
}