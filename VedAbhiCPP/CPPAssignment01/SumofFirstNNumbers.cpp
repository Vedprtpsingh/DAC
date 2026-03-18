#include <iostream>
using namespace std;
int SumofFirstNNumbers() {
    int n,sum=0;
    cout << "Enter Number: ";
    cin >> n;
    while(n!=0){
        sum=n+sum;
        n--;
    }
    return sum;
}
int main() {
    cout << SumofFirstNNumbers() << endl;
    return 0;
}
