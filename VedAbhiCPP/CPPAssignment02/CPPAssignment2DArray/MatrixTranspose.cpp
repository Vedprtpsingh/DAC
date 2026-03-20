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
    int transmat[n][m];
    cout << "Enter elements of matrix: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr1[i][j];
        }
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            transmat[i][j] = arr1[j][i];
        }
    }
    cout << "Matrix: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr1[i][j] << " ";
        }
        cout << endl;
    }
    cout << "Transpose matrix: " << endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << transmat[i][j] << " ";
        }
        cout << endl;
    }
}