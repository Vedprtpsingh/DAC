#include <iostream>
using namespace std;
void addTwoInteger(){
    int a, b;
    cout << "Enter first number: ";
    cin >> a;
    cout << "Enter second number: ";
    cin >> b;
    cout << a << "+" << b << "=" << a + b << endl;
}
#include <iostream>
using namespace std;
void twobinarynumbers(){
    int a, b;
    cout << "Enter first binary number: ";
    cin >> a;
    cout << "Enter second binary number: ";
    cin >> b;
    int sum = 0, carry = 0, p = 1;
    while (a != 0 || b != 0 || carry != 0)
    {
        int b1 = a % 10;
        int b2 = b % 10;
        int s = b1 + b2 + carry;
        int digit = s % 2;
        carry = s / 2;
        sum =sum+ digit * p;
        p =p* 10;
        a =a/ 10;
        b =b/ 10;
    }
    cout << "Sum: " << sum << endl;
}
void twoCharacters(){
    char a, b;
    cout << "Enter first Char: ";
    cin >> a;
    cout << "Enter second Char: ";
    cin >> b;
    cout << "Sum: " << a + b << endl;
}
int main()
{
    addTwoInteger();
    twobinarynumbers();
    twoCharacters();
}
