#include <iostream>
using namespace std;

void LeftShiftandRightShift() {
    int a, b;
    cout << "Enter First Number: ";
    cin >> a;
    cout << "Number for Shift: ";
    cin >> b;

    cout << "Left Shift: " << (a << b) << endl;
    cout << "Right Shift:"  << (a >> b) << endl;
}

int main() {
    LeftShiftandRightShift();
    return 0;
}
