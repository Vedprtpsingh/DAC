#include<iostream>
using namespace std;

#define SIZE 12

int main(){
    int arr[SIZE];
    cout<<"Enter The Transations: ";
    cout<<"Enter "<<SIZE<<" Numbers"<<endl;
    for(int i=0;i<SIZE;i++){
        cin>>arr[i];
    }
    int bal=0,hidb=arr[0],hicd=arr[0],hcmn,hdnm,nofd=0,nofc=0;
    cout<<"Transations is: "<<endl;
    for(int i=0;i<SIZE;i++){
        cout<<arr[i]<<" ";
        if(arr[i]<0){
            nofd++;
            if(hidb>arr[i]){
                hidb=arr[i];
                hdnm=i;
            }
        }
        if(arr[i]>0){
            nofc++;
            if(hicd<arr[i]){
                hicd=arr[i];
                hcmn=i;
            }
        }
        bal+=arr[i];
    }
    cout<<"Net bal: "<<bal<<endl;
    cout<<"Manth Highest Credit: "<<hcmn+1<<endl;
    cout<<"Manth Highest Debit: "<<hdnm+1<<endl;
    cout<<"Number of Credit: "<<nofc<<endl;
    cout<<"Number of Debit: "<<nofd<<endl;

    cout<<"All months where the transaction was a debit. "<<endl;
    for(int i=0;i<SIZE;i++){

        if(arr[i]<0){
            cout<<i+1<<" ";
        }
    }
    return 0;

}