#include <iostream>
using namespace std;
#define emp 2
class Employee
{
    int empid;
    string ename;
    int basicsal;
    float hra, da;

public:
    void employeedetails();
    void displayEmployee();
    float grossSal();
};
void Employee::employeedetails()
{
    cout << "Enter Employee id: ";
    cin >> empid;

    cout << "Enter Employee Name: ";
    cin >> ename;
    cout << "Enter Basic salary: ";
    cin >> basicsal;
    cout << "Enter HRA: ";
    cin >> hra;
    cout << "Enter DA: ";
    cin >> da;
}
void Employee::displayEmployee()
{
    cout << "Employee id: " << empid << endl;
    cout << "Employee Name: " << ename << endl;
    cout << "Basic Sal: " << basicsal << endl;
    cout << "HRA: " << hra << endl;
    cout << "DA: " << da << endl;
}
float Employee::grossSal()
{
    float gross = basicsal + (basicsal * hra / 100) + (basicsal * da / 100);
    return gross;
}
int main()
{
    Employee e[emp];
    for (int i = 0; i < emp; i++)
    {
        cout<<"Enter Employee "<<i+1<<" Details: "<<endl;
        e[i].employeedetails();
    }
    for (int i = 0; i < emp; i++)
    {
        cout << "Displaying  Employee " << i + 1 << " Details:" << endl;
        e[i].displayEmployee();
        cout << "Gross salary: " << e[i].grossSal() << endl;
    }
    return 0;
}
