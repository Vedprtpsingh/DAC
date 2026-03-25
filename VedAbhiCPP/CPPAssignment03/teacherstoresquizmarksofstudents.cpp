#include <iostream>
using namespace std;
#define STUDENTS 400000
int arr[STUDENTS];
char name[STUDENTS];
void sortMarks(int arr[]){
    for(int i=0;i<STUDENTS-1;i++){
        for(int j=0;j<STUDENTS-1-i;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j+1],arr[j]);
                swap(name[j+1],name[j]);
            }
        }
    }
}
int main()
{   char ch='A';
    for (int i = 0; i < STUDENTS; i++)
    {   
        arr[i]=rand()%101;
        name[i]=ch;
        cout<<name[i]<<": ";
        cout<<arr[i]<<" "<<endl;
        ch++;
    }
    cout<<endl;

    cout<<"Sorted Marks: "<<endl;

    sortMarks(arr);
        for (int i = STUDENTS-1; i >=0; i--)
    {
        cout<<"Name: "<<name[i]<<": ";
        cout<<"Marks: "<<arr[i]<<" "<<"RANK: "<<STUDENTS-i<<endl;

    }
    return 0;
}

