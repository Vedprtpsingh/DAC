#include <iostream>
using namespace std;

class Rectangle
{
private:
int l,b;
public:
    Rectangle(int le,int br)
    {
        l=le;
        b=br;
        if(l==b){
            cout<<"This is a Square"<<endl;
        }
        else {
            cout<<"This is a Rectangle"<<endl;
        }
    }
    void RectangleArea()
    {
        cout<<"Area = "<<l*b<<endl;
    }
    void RectanglePerimeter(){
        cout<<"Perimeter = "<<2*(l+b)<<endl;
    }
};
int main(){
    int l=2;
    int b=2;
    Rectangle b1=Rectangle(l,b);
    b1.RectangleArea();
    b1.RectanglePerimeter();
    return 0;
}