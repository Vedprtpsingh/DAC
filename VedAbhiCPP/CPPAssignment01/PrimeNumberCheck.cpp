#include <iostream>
using namespace std;
bool CheckPrime(int n) {
    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
int main() {
    int n;
    cout << "Enter Positive Number: ";
    cin >> n;
    (CheckPrime(n)==true?cout<<"It's Prime!":cout<<"It's not a Prime!");
    return 0;
}
