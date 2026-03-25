#include <iostream>
#include <cstdlib>
using namespace std;

#define SIZE 10
void initializeArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        arr[i] = rand() % 100;
    }
}
void displayArray(int arr[], int n) {
    cout << "Array elements: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int sumArray(int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    return sum;
}
int maxArray(int arr[], int n) {
    int maxVal = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > maxVal) {
            maxVal = arr[i];
        }
    }
    return maxVal;
}
int minArray(int arr[], int n) {
    int minVal = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] < minVal) {
            minVal = arr[i];
        }
    }
    return minVal;
}
int main() {
    int arr[SIZE];
    initializeArray(arr, SIZE);
    displayArray(arr, SIZE);
    cout << "Sum of elements = " << sumArray(arr, SIZE) << endl;
    cout << "Maximum value = " << maxArray(arr, SIZE) << endl;
    cout << "Minimum value = " << minArray(arr, SIZE) << endl;

    return 0;
}
