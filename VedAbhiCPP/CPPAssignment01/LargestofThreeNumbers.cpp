#include <iostream>
using namespace std;
int EvenorOddUsingTernary() {
    int a,b,c;
    cout << "Enter First Number: ";
    cin >> a;
    cout << "Enter Second Number: ";
    cin >> b;
    cout << "Enter Third Number: ";
    cin >> c;
    int max;
    return (a>b)?(a>c?a:c):(b>c?b:c);
}
int main() {
    cout << EvenorOddUsingTernary() << endl;
    return 0;
}
