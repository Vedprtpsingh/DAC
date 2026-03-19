#include <iostream>
using namespace std;
int Factorial() {
    int n,f=1;
    cout << "Enter Number for Factorial: ";
    cin >> n;
    while(n!=0){
        f=n*f;
        n--;
    }
    return f;
}
int main() {
    cout << Factorial() << endl;
    return 0;
}
