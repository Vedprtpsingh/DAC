#include <iostream>
using namespace std;
void BitwiseANDORandXOR() {
    int a, b;
    cout << "Enter First Number: ";
    cin >> a;
    cout << "Enter Second Number: ";
    cin >> b;

    cout << "AND: " << (a & b) << endl;
    cout << "OR: "  << (a | b) << endl;
    cout << "XOR: " << (a ^ b) << endl;
}

int main() {
    BitwiseANDORandXOR();
    return 0;
}
