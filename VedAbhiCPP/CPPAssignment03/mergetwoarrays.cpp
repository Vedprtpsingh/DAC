#include <iostream>
using namespace std;
#define SIZE1 15
#define SIZE2 10
int arr1[SIZE1];
int arr2[SIZE2];
int main()
{   cout<<"Array1: "<<endl;
    for (int i = 0; i < SIZE1; i++)
    {
        arr1[i]=rand()%100;
        cout<<arr1[i]<<" ";
    }
    cout<<endl;
    cout<<"Array2: "<<endl;
    for (int i = 0; i < SIZE2; i++)
    {
        arr2[i]=rand()%100;
        cout<<arr2[i]<<" ";
    }
    cout<<endl;



    
    int arr3[SIZE1+SIZE2],i=0;
        for (i; i < SIZE1; i++)
    {
        arr3[i]=arr1[i];
    }
    for (i; i < SIZE1+SIZE2; i++)
    {
        arr3[i]=arr2[i-SIZE1];
    }
    cout<<"Marged Aarray"<<endl;
        for (i=0; i < SIZE1+SIZE2; i++)
    {
        cout<<arr3[i]<<" ";
    }
    return 0;
}