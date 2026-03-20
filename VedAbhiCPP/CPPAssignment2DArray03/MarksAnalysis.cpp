#include <iostream>
using namespace std;
int main()
{
    int st, sub,total=0,higest=0,avg=0,sum=0;
    cout << "Enter no of Students: " << endl;
    cin >> st;
    cout << "Enter no of subjects: " << endl;
    cin >> sub;
    int arr1[st][sub];
    cout << "Enter elements of matrix: " << endl;
    for (int i = 0; i < st; i++)
    {
        cout<<"Enter marks for student "<<i+1<<endl;
        for (int j = 0; j < sub; j++)
        {
            cout<<" subject "<<j+1<<": ";
            cin >> arr1[i][j];
        }
    }
     for (int i = 0; i < st; i++)
    {
        for (int j = 0; j < sub; j++)
        {
            total+=arr1[i][j];
        }
        cout<<"Student "<<i+1<<" Total "<< total<<" ";
        cout<<endl;
        if(higest<total){
            higest=total;
        }
        total=0;
    }
         for (int i = 0; i < sub; i++)
    {
        for (int j = 0; j < st; j++)
        {
            total+=arr1[j][i];
        }
        cout<<"Avg in Sub "<<i+1<<"is: "<< (float)total/st<<" "<<endl;
        total=0;
    }
}
