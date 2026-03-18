#include <iostream>
using namespace std;
int CountDigits() {
    int n,d=0;
    cout << "Enter Number: ";
    cin >> n;
    while(n!=0){
        n=n/10;
        d++;
    }
    return d;
}
int main() {
    cout << CountDigits() << endl;
    return 0;
}
