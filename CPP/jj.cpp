#include <iostream>
using namespace std;

int main() {
    double a, b;
    char op;

    cout << "Enter expression (e.g. 5 + 3): ";
    cin >> a >> op >> b;

    switch (op) {
        case '+': cout << "= " << a + b; break;
        case '-': cout << "= " << a - b; break;
        case '*': cout << "= " << a * b; break;
        case '/':
            if (b != 0) cout << "= " << a / b;
            else cout << "Error: division by zero";
            break;
        default: cout << "Unknown operator";
    }

    cout << endl;
    return 0;
}
