#include <iostream>
using namespace std;

void swapUsingTempVariable() {
    int a,b;
    cout << "Enter First Number: ";
    cin >> a;
    cout << "Enter Second Number: ";
    cin >> b;
    cout << "Before Swap "<<"a: "<<a<<" b: "<<b<<endl;
    int temp=a;
    a=b;
    b=temp;
    cout << "After Swap "<<"a: "<<a<<" b: "<<b<<endl;
    

}
void swapWithoutTempVariable() {
    int a,b;
    cout << "Enter First Number: ";
    cin >> a;
    cout << "Enter Second Number: ";
    cin >> b;
    cout << "Before Swap "<<"a: "<<a<<" b: "<<b<<endl;
    a=a+b;
    b=a-b;
    a=a-b;
    cout << "After Swap "<<"a: "<<a<<" b: "<<b<<endl;
    

}

int main() {
    swapUsingTempVariable();
    swapWithoutTempVariable();
    return 0;
}
