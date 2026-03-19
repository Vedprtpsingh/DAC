#include<iostream>
using namespace std;
#define SIZE 8
void display(int arr[]);
void searchtocheck(int arr[]);
int main(){
    int arr[SIZE],totalbefore=0,totalafter=0,count=0;
    cout<<"Total Days Revenue"<<endl;
    
    for(int i=0;i<SIZE;i++){
        arr[i]=(rand()%2000);
        totalbefore+=arr[i];
    }
    int mostexpensive=arr[0],leastexpensive=arr[0];
    display(arr);
    //Discount
    for(int i=0;i<SIZE;i++){
        totalbefore+=arr[i];
        if(arr[i]>1000){
            arr[i]=arr[i]-arr[i]*(0.1);
        }
        totalafter+=arr[i];
        if(arr[i]>500){
            count++;
        }
        if(mostexpensive<arr[i]){
        mostexpensive=arr[i];
        }
        if(leastexpensive>arr[i]){
            leastexpensive=arr[i];
        }
    }
    cout<<"10 per discout on above item 1000: "<<endl;
    display(arr);

    cout<<"Most Expensive: "<<mostexpensive<<endl;
    cout<<"Least Expensive: "<<leastexpensive<<endl;


    cout<<"Total bill before Discount: "<<totalbefore<<endl;
    cout<<"Total bill after Discount: "<<totalafter<<endl;

    int removeitem;
    cout<<"Enter The index for remove"<<endl;
    cin>>removeitem;
    if(removeitem>SIZE-1){
        cout<<"Index is not Found"<<endl;
    }else{
        arr[removeitem]=0;
    }
    display(arr);


    cout<<"Total item Eligible for GST: "<<count<<endl;



}
void display(int arr[]){
    cout<<"Airline Seat Display: ";
    for (int i = 0; i < SIZE; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

