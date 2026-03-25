#include <iostream>
using namespace std;
#define ele 10
#define totalElementType 5
char arr[ele];
int count[totalElementType];
int main()
{
    for (int i = 0; i < ele; i++)
    {
        arr[i] = 'A' + i;
    }
    cout << "Element Array " << endl;
    for (int i = 0; i < ele; i++)
    {
        int a = rand() % totalElementType;
        arr[i] = 'A' + a;
        cout << arr[i] << " ";
        count[a] = count[a] + 1;
    }
    cout<<endl;
    char ch='A';
    for(int i=0;i<totalElementType;i++){
        cout<<ch<<": "<<count[i]<<endl;
        ch++;
    }
    cout << endl;
    return 0;
}
