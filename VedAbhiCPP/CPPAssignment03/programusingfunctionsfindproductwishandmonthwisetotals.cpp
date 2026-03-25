#include <iostream>
#include <cstdlib>
using namespace std;
#define PRO 4
#define MONTHS 6
int arr[PRO][MONTHS];
void fillSales(int arr[PRO][MONTHS]) {
    for (int i = 0; i < PRO; i++) {
        for (int j = 0; j < MONTHS; j++) {
            arr[i][j] = rand() % 9990;
        }
    }
}
void productTotals(int arr[PRO][MONTHS]) {
    cout << "\nProduct-wise totals:\n";
    for (int i = 0; i < PRO; i++) {
        int psum = 0;
        for (int j = 0; j < MONTHS; j++) {
            psum += arr[i][j];
        }
        cout << "Product " << i + 1 << " total = " << psum << endl;
    }
}
void monthTotals(int arr[PRO][MONTHS]) {
    cout << "\nMonth-wise totals:\n";
    for (int j = 0; j < MONTHS; j++) {
        int msum = 0;
        for (int i = 0; i < PRO; i++) {
            msum += arr[i][j];
        }
        cout << "Month " << j + 1 << " total = " << msum << endl;
    }
}

int main() {

    fillSales(arr);
    productTotals(arr);
    monthTotals(arr);

    return 0;
}
