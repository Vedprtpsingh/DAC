#include <iostream>
#include <cmath>
using namespace std;

void compoundinterest() {
    double p, r; 
    int t, n;

    cout << "Enter Principal: ";
    cin >> p;
    cout << "Enter annual interest rate (in %): ";
    cin >> r;
    cout << "Enter time (in years): ";
    cin >> t;
    cout << "Enter number of times interest is compounded per year: ";
    cin >> n;
    r = r / 100.0;

    double ci = p * pow(1 + (r / n), n * t) - p;
    cout << "Compound Interest: " << ci << endl;
    cout << "Final Amount: " << (p + ci) << endl;
}

int main() {
    compoundinterest();
    return 0;
}
