#include <iostream>
using namespace std;
class Vehicle {
protected:
    string brand;
    int rentPerDay;
public:
    Vehicle(string b = "", int rent = 0) {
        brand = b;
        rentPerDay = rent;
    }
    virtual int calculateRent(int days) {
        return days * rentPerDay;
    }
    virtual void showBill(int days) {
        cout << "Brand: " << brand << endl;
        cout << "Base Rent (" << days << " days): " << days * rentPerDay << endl;
    }
};
class Car : public Vehicle {
private:
    int acChargePerDay;
public:
    Car(string b, int rent, int acCharge) : Vehicle(b, rent) {
        acChargePerDay = acCharge;
    }
    int calculateRent(int days) override {
        return (days * rentPerDay) + (days * acChargePerDay);
    }
    void showBill(int days) override {
        cout << "\nCar Rental Bill\n";
        cout << "Brand: " << brand << endl;
        cout << "Base Rent (" << days << " days): " << days * rentPerDay << endl;
        cout << "AC Charges (" << days << " days): " << days * acChargePerDay << endl;
        cout << "Total Rent: " << calculateRent(days) << endl;
    }
};
class Bike : public Vehicle {
private:
    int helmetChargePerDay;
public:
    Bike(string b, int rent, int helmetCharge) : Vehicle(b, rent) {
        helmetChargePerDay = helmetCharge;
    }
    int calculateRent(int days) override {
        return (days * rentPerDay) + (days * helmetChargePerDay);
    }
    void showBill(int days) override {
        cout << "\nBike Rental Bill\n";
        cout << "Brand: " << brand << endl;
        cout << "Base Rent (" << days << " days): " << days * rentPerDay << endl;
        cout << "Helmet Charges (" << days << " days): " << days * helmetChargePerDay << endl;
        cout << "Total Rent: " << calculateRent(days) << endl;
    }
};
int main() {
    Car c("Toyota", 1000, 200);
    Bike b("Yamaha", 500, 50);
    int days;
    cout << "Enter number of rental days: ";
    cin >> days;
    c.showBill(days);
    b.showBill(days);
    return 0;
}
