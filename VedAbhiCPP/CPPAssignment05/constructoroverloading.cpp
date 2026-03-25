#include <iostream>
using namespace std;

class Box
{
private:
int side,l,b,h;
public:
    Box()
    {
        cout<<"volume = 1"<<endl;
    }
    Box(int side)
    {
        cout<<"Volume = "<<side*side*side<<endl;
    }
    Box(int l,int b,int h){
        cout<<"Volume = "<<l*b*h<<endl;
    }
};
int main(){
    Box b;
    Box(3);
    Box(2,3,4);
    return 0;
}