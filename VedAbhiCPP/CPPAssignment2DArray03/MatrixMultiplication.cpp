#include <iostream>
using namespace std;
int main()
{
    int m, n, x, y;
    cout << "Enter no of rows for first matrix: " << endl;
    cin >> m;
    cout << "Enter no of columns for first matrix: " << endl;
    cin >> n;
    cout << "Enter no of rows for second matrix: " << endl;
    cin >> x;
    cout << "Enter no of columns for second matrix: " << endl;
    cin >> y;
    int arr1[m][n];
    int arr2[x][y];
    int mulmat[m][y];
    if (x != n)
    {
        cout << "multiplication is not possible";
        return 0;
    }
    cout << "Enter elements of first matrix: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr1[i][j];
        }
    }
    cout << "Enter elements of second matrix: " << endl;
    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j < y; j++)
        {
            cin >> arr2[i][j];
        }
    }
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < y; j++)
        {
            mulmat[i][j] = 0;
            for (int k = 0; k < n; k++)
            {
                mulmat[i][j] += arr1[i][k] * arr2[k][j];
            }
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
    cout << "Second matrix: " << endl;

    for (int i = 0; i < x; i++)
    {
        for (int j = 0; j < y; j++)
        {
            cout << arr2[i][j] << " ";
        }
        cout << endl;
    }
    cout << "Multiplied matrix: " << endl;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < y; j++)
        {
            cout << mulmat[i][j] << " ";
        }
        cout << endl;
    }
}