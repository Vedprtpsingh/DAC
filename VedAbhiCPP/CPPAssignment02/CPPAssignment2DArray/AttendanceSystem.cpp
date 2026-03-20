#include <iostream>
using namespace std;
#define DAY 5
int main()
{
    int st,total=0,sum=0,count=0;
    cout << "Enter no of Students: " << endl;
    cin >> st;
    bool arr[st][DAY];
        for (int i = 0; i < st; i++)
    {
        for (int j = 0; j < DAY; j++)
        {
            arr[i][j]=rand()%2;
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
    for (int i = 0; i < st; i++)
    {
        for (int j = 0; j < DAY; j++)
        {
            if(arr[i][j]==1){
                count++;
            }
        }
        float per=(float)((count*100)/DAY);
        cout<<"Student "<<i+1<<" Attendence Percentage is: "<<per;
        if(per<75){
            cout<<" Low Attendance";
        }
        cout<<endl;
        count=0;
    }


}
