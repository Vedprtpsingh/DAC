#include <iostream>
#include <string>
using namespace std;
string EvenorOddUsingTernary() {
    int a;
    cout << "Enter Number: ";
    cin >> a;
    return (a % 2 == 0) ? "Number is Even" : "Number is Odd";
}
int main() {
    cout << EvenorOddUsingTernary() << endl;
    return 0;
}
