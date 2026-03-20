#include <iostream>
using namespace std;
int main()
{
    int m, n;
    cout << "Enter no of rows " << endl;
    cin >> m;
    cout << "Enter no of columns " << endl;
    cin >> n;
    int arr1[m][n];
    int arr2[m][n];
    int addmat[m][n];
    cout << "Enter elements of first matrix: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr1[i][j];
        }
    }
    cout << "Enter elements of second matrix: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr2[i][j];
        }
    }
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            addmat[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    cout << "First matrix: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr1[i][j] << " ";
        }
        cout << endl;
    }
    cout << "First matrix: " << endl;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr2[i][j] << " ";
        }
        cout << endl;
    }
    cout << "Added matrix: " << endl;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << addmat[i][j] << " ";
        }
        cout << endl;
    }
}