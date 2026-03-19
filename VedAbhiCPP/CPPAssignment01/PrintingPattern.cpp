#include <iostream>
using namespace std;
void PrintingPattern() {
    int n,m,revNum=0;
    cout << "Enter Number: ";
    cin >> n;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
        cout<<"* ";
        }
        cout<<endl;
    }
}
int main() {
    PrintingPattern();
    return 0;
}
