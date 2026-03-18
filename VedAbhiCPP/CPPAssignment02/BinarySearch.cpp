#include<iostream>
using namespace std;
string binarySearch(int arr[],int n,int search){
    int mid,first=0,last=n-1;
    while (first<=last)
    {   mid=(first+last)/2;
        if(arr[mid]==search){
            return "Element is Present";
        }else if(arr[mid]<search){
            first=mid+1;
        }else{
            last=mid-1;
        }
    }
    return "Element is not Present";
}
int main(){
    int arr[9]={1,2,3,4,5,6,7,8,9};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<binarySearch(arr,n,7);
    return 0;
}
