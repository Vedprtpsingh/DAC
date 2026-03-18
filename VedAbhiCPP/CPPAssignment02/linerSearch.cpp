#include<iostream>
using namespace std;
int main(){
    int arr[9]={2,65,8,2,6,8,0,11,99};
    int n=sizeof(arr)/sizeof(arr[0]);
    int search=9;
    for(int i=0;i<n;i++){
        if(search==arr[i]){
            cout<<"Element is Present";
            return 0;
        }
    }
    cout<<"Element is not Present";
    return 0;
}
