#include <iostream>
using namespace std;

#define totalaccount 2

class BankAccount {
    int accountNumber;
    string customerName; 
    float balance;
public:
    void addAccountHolder();
    void depositMoney();
    void withdrawMoney();
    void displayBalance();
};

BankAccount ba[totalaccount];

void BankAccount::addAccountHolder() {
    for(int i=0; i<totalaccount; i++){
        cout << "Enter BankAccount Number: ";
        cin >> ba[i].accountNumber;

        cout << "Enter BankAccount Holder Name: ";
        cin >> ba[i].customerName;

        cout << "Enter Balance: ";
        cin >> ba[i].balance;
    }
}

void BankAccount::depositMoney() {
    int ban;
    cout << "Enter BankAccount Number to deposit: ";
    cin >> ban;
    bool found = false;

    for (int j = 0; j < totalaccount; j++) {
        if(ban == ba[j].accountNumber){
            found = true;
            int amount;
            cout << "Enter Amount To Deposit: ";
            cin >> amount;
            ba[j].balance += amount;
            cout << "Deposit successful. New Balance: " << ba[j].balance << endl;
            break;
        }
    }
    if(!found) cout << "Account Not Found" << endl;
}

void BankAccount::withdrawMoney() {
    int ban;
    cout << "Enter BankAccount Number to withdraw: ";
    cin >> ban;
    bool found = false;

    for (int j = 0; j < totalaccount; j++) {
        if(ban == ba[j].accountNumber){
            found = true;
            int amount;
            cout << "Enter Amount To Withdraw: ";
            cin >> amount;
            if(amount <= ba[j].balance){
                ba[j].balance -= amount;
                cout << "Withdrawal successful. New Balance: " << ba[j].balance << endl;
            } else {
                cout << "Insufficient Balance!" << endl;
            }
            break;
        }
    }
    if(!found) cout << "Account Not Found" << endl;
}

void BankAccount::displayBalance() {
    int ban;
    cout << "Enter BankAccount Number to check balance: ";
    cin >> ban;
    bool found = false;

    for(int i=0; i<totalaccount; i++){
        if(ba[i].accountNumber == ban){
            found = true;
            cout << "Balance is: " << ba[i].balance << endl;
            break;
        }
    }
    if(!found) cout << "Account Not Found" << endl;
}

int main() {
    BankAccount b;
    b.addAccountHolder();
    b.depositMoney();
    b.displayBalance();
    b.withdrawMoney();
    b.displayBalance();
    return 0;
}
