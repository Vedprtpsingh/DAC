#include <iostream>
#define prod 3
using namespace std;

class Product
{
private:
    int id;
    string name;
    float price;
    int quantity;

public:
    Product()
    {
    }
    Product(int pid, string pname, float pprice, int pquantity)
    {
        id = pid;
        name = pname;
        price = pprice;
        quantity = pquantity;
    }

    void checkThreshold(int threshold)
    {
        if (quantity < threshold)
        {
            cout << "Product " << name << " (ID: " << id << ") is below threshold!" << endl;
        }
        else
        {
            cout << "Product " << name << " (ID: " << id << ") is sufficient." << endl;
        }
    }
};

int main()
{
    Product p[prod];
    int id;
    string name;
    float price;
    int quantity;
    for (int i = 0; i < prod; i++)
    {
        cout << "Enter Product " << i + 1 << " id: " << endl;
        cin >> id;
        cout << "Enter Product " << i + 1 << " Name: " << endl;
        cin >> name;
        cout << "Enter Product " << i + 1 << " Price: " << endl;
        cin >> price;
        cout << "Enter Product " << i + 1 << " Quantity: " << endl;
        cin >> quantity;
        p[i] = Product(id, name, price, quantity);
    }

    int threshold;
    cout << "Enter threshold quantity: ";
    cin >> threshold;

    for (int i = 0; i < prod; i++)
    {
        p[i].checkThreshold(threshold);
    }

    return 0;
}
