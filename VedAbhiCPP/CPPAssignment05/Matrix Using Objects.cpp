#include <iostream>
using namespace std;

class Matrix {
private:
    int mat[3][3];
public:
    Matrix() {
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                mat[i][j] = 0;
    }
    void input() {
        cout << "Enter 3x3 matrix values:\n";
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                cin >> mat[i][j];
            }
        }
    }
    void display() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                cout << mat[i][j] << " ";
            }
            cout << endl;
        }
    }
    Matrix add(Matrix &m) {
        Matrix result;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                result.mat[i][j] = mat[i][j] + m.mat[i][j];
            }
        }
        return result;
    }
};

int main() {
    Matrix m1, m2, sum;

    cout << "Matrix 1:\n";
    m1.input();

    cout << "Matrix 2:\n";
    m2.input();

    sum = m1.add(m2);

    cout << "\nMatrix 1:\n";
    m1.display();

    cout << "\nMatrix 2:\n";
    m2.display();

    cout << "\nSum of Matrices:\n";
    sum.display();

    return 0;
}
