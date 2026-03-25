#include <iostream>
using namespace std;
#define SIZE 5
int arr[SIZE];
void secondMax(int arr[])
{
    int max = arr[0], secMax;
    for (int i = 0; i < SIZE; i++)
    {
        if (max < arr[i])
        {
            secMax = max;
            max = arr[i];
        }
    }
    for (int i = 0; i < SIZE; i++)
    {
        if (secMax < arr[i])
        {
            if (max != arr[i])
            {
                secMax = arr[i];
            }
        }
    }
    cout << "Second Max: " << secMax;
}
int main()
{
    cout << "Enter The Element: " << endl;
    for (int i = 0; i < SIZE; i++)
    {
        cin >> arr[i];
    }
    secondMax(arr);
}
