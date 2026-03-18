#include <iostream>
using namespace std;

void MaximumofTwoNumbers() {
    int a, b;
    cout << "Enter First Number: ";
    cin >> a;
    cout << "Enter Second Number: ";
    cin >> b;
    if(a>b){
    cout << "Max: " << a << endl;
    }else{
    cout << "Max Number: " << b << endl;
    }
}

int main() {
    MaximumofTwoNumbers();
    return 0;
}
