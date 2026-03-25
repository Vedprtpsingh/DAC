#include <iostream>
using namespace std;
#define STU 10
#define SUB 3
class Student {
    int rolln;
    string name;
    int marks[SUB];
public:
    void enterStudent();
    void displayStudent();
    int totalMarks();
    float avgMarks();
};
void Student::enterStudent() {
    cout << "Enter Student RN: ";
    cin >> rolln;

    cout << "Enter Student Name: ";
    cin >> name;

    cout << "Enter " << SUB << " Subject Marks: ";
    for (int j = 0; j < SUB; j++) {
        cin >> marks[j];
    }
}
void Student::displayStudent() {
    cout << "Student RN: " << rolln << endl;
    cout << "Student Name: " << name << endl;
    cout << "Marks: ";
    for (int j = 0; j < SUB; j++) {
        cout << marks[j] << " ";
    }
    cout << endl;
}
int Student::totalMarks() {
    int total = 0;
    for (int j = 0; j < SUB; j++) {
        total += marks[j];
    }
    return total;
}
float Student::avgMarks() {
    return totalMarks() / (float)SUB;
}
int main() {
    Student s[STU];

    for (int i = 0; i < STU; i++) {
        cout << "\nEntering details for Student " << i + 1 << endl;
        s[i].enterStudent();
    }
    for (int i = 0; i < STU; i++) {
        cout << "\nDetails of Student " << i + 1 << endl;
        s[i].displayStudent();
        cout << "Total Marks: " << s[i].totalMarks() << endl;
        cout << "Average Marks: " << s[i].avgMarks() << endl;
    }
    return 0;
}
