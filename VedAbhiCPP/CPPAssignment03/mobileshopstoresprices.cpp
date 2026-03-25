#include <iostream>
using namespace std;
#define SIZE 15
int arr[SIZE];
void sortPrice(int arr[]){
    for(int i=0;i<SIZE-1;i++){
        for(int j=0;j<SIZE-1-i;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j+1],arr[j]);
            }
        }
    }
}
int main()
{
    for (int i = 0; i < SIZE; i++)
    {
        arr[i]=rand()+15000;
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    cout<<"Sorted Array: "<<endl;

    sortPrice(arr);
        for (int i = 0; i < SIZE; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    cout<<"Cheapest phone prices: "<<arr[0]<<endl;
    cout<<"Costliest phone prices: "<<arr[SIZE-1];

    return 0;
}