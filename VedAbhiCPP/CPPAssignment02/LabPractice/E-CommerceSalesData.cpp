#include<iostream>
using namespace std;

#define SIZE 30

void searchtocheck(int arr[],int search);

int main(){
    int trans[SIZE];
    int bsd=0,wsd=trans[0],sum=0,daymore,b,l;
    cout<<"Total Days Revenue"<<endl;
    for(int i=0;i<SIZE;i++){
        trans[i]=(rand()%15000);
        cout<<trans[i]<<" ";
    }
    cout<<endl;
    cout<<"day where sales exceeded ₹10,000: "<<endl;
    for(int i=0;i<SIZE;i++){
        if(trans[i]>10000){
            cout<<i+1<<" ";
        }
        sum+=trans[i];
        if(bsd<trans[i]){
            bsd=trans[i];
            b=i;
        }
        if(wsd>trans[i]){
            wsd=trans[i];
            l=i;
        }
    }
    cout<<endl;
    cout<<"Best selling day: "<<bsd<<endl;
    cout<<"worst selling day: "<<wsd<<endl;

    searchtocheck(trans,10000);
}
void searchtocheck(int arr[],int search){
    for(int i=0;i<SIZE;i++){
        if(search==arr[i]){
            cout<<arr[i]<<" amount exists in the data: "<<i+1;
            return;
        }
    }
    cout<<"amount not exists in the data";
}