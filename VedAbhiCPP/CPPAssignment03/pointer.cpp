#include<iostream>
using namespace std;
int main(){
    int a=3;
    int *aptr;
    aptr=&a;

    cout<<a<<endl;
    cout<<&a<<endl;
    cout<<aptr<<endl;
    cout<<*aptr+4<<endl;
    int arr[a];
    int *ptrarr[a];
    for(int i=0;i<a;i++){
        cin>>arr[i];
        ptrarr[i]=&arr[i];
    }
    for(int i=0;i<a;i++){
        cout<<arr[i]<<" ";
        cout<<&arr[i]<<" ";
        cout<<ptrarr[i]<<" ";
        cout<<endl;
    }
    int *ptr =&a;
        cout << ptr << endl;
        cout << &ptr << endl;
        cout << *ptr << endl;

    return 0; 
}