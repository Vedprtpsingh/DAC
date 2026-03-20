#include<iostream>
using namespace std;
#define SIZE 50
void searchtocheck(bool arr[]);
void display(bool arr[]);
int main(){
    bool arr[SIZE];
    for(int i=0;i<SIZE;i++){
        arr[i]=rand()%2;
    }
    display(arr);
    cout<<"Avalible seats: ";
    for(int i=0;i<SIZE;i++){
        if(arr[i]==0){
            cout<<i+1<<" ";
        }
    }
    cout<<"Book First Avalible Seat: ";
    for(int i=0;i<SIZE;i++){
        if(arr[i]==0){
            arr[i]=1;
            cout<<"Seat "<<i+1<<" Book Conformed:";
            break;
        }
    }
    display(arr);

    searchtocheck(arr);
    return 0;
}
void display(bool arr[]){
    cout<<"Airline Seat Display: ";
    for (int i = 0; i < SIZE; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
}
void searchtocheck(bool arr[]){
    cout<<"Enter Element To Search: ";
    int s;
    cin>>s;
    if(arr[s-1]==1){
        cout<<"Seat is not avalible";
    }else{
        cout<<"Seat is avalible";
    }
}