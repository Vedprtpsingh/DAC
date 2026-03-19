#include<iostream>
using namespace std;

#define SIZE 10

void sortOfItems(int arr[]);

int main(){
    int arr[SIZE];
    
    for(int i=0;i<SIZE;i++){
        cout<<"Enter Element: "<<i<<endl;
        cin>>arr[i];
    }

    int exi=arr[0], cheapi=arr[0], sum=0, count=0;

    for(int i=0;i<SIZE;i++){
        if(exi < arr[i]){
            exi = arr[i];
        }
        if(cheapi > arr[i]){
            cheapi = arr[i];
        }
        if(arr[i] > 500){
            count++;
        }
        sum += arr[i];
    }

    cout<<"Most Expensive: "<<exi<<endl;
    cout<<"Most Cheapest: "<<cheapi<<endl;
    cout<<"Items above 500: "<<count<<endl;
    cout<<"avg: "<<(sum/SIZE)<<endl;

    sortOfItems(arr);

    return 0;
}

void sortOfItems(int arr[]){
    for(int i=0;i<SIZE-1;i++){
        for(int j=0;j<SIZE-1-i;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    cout << "Sorted items: ";
    for(int i=0;i<SIZE;i++){
        cout<<arr[i]<<" ";
    }
}