#include <iostream>
using namespace std;
#define voter 150000000
#define totalCandi 5
int arr[voter];
char names[totalCandi];

char candiName;
int count[totalCandi];
void sortvotes(int arr[]){
    for(int i=0;i<totalCandi-1;i++){
        for(int j=0;j<totalCandi-1-i;j++){
            if(arr[j]>count[j+1]){
                swap(count[j+1],count[j]);
                swap(names[j+1],names[j]);
            }
        }
    }
}
int main()
{   for(int i=0;i<totalCandi;i++){
    names[i]='A'+i;
}
    cout<<"candidates: "<<endl;
    for (int i = 0; i < voter; i++)
    {   int a=rand()%totalCandi;
        candiName='A'+a;
        cout<<candiName<<" ";
        count[a]=count[a]+1;
        
    }
    cout<<endl;
    cout<<"Votes: "<<endl;
    for (int i = 0; i < totalCandi; i++){
        cout<<count[i]<<" "<<endl;
        
    }
    sortvotes(count);
    cout<<"Winner is : "<<names[totalCandi-1]<<" Total Votes: "<<count[totalCandi-1]<<endl;
    cout<<"Winner is : "<<names[totalCandi-2]<<" Total Votes: "<<count[totalCandi-2]<<endl;

    return 0;
}