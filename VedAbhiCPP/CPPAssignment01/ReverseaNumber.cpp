#include <iostream>
using namespace std;
int ReverseaNumber() {
    int n,m,revNum=0;
    cout << "Enter Number: ";
    cin >> n;
    while(n!=0){
        m=n%10;
        n=n/10;
        
        revNum=revNum*10+m;
    }
    return revNum;
}
int main() {
    cout << ReverseaNumber() << endl;
    return 0;
}
