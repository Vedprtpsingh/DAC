#include <iostream>
using namespace std;
int max(int a,int b,int c){
    return a>b?((a>c)?a:c):((b>c)?b:c);
}
float max(float a,float b,float c){
    return a>b?((a>c)?a:c):((b>c)?b:c);
}
char max(char a,char b,char c){
    return a>b?((a>c)?a:c):((b>c)?b:c);
}
int main()
{ 
    cout<<max(2,7,8)<<endl;
    cout<<max(65.2f,1.8f,8.6f)<<endl;
    cout<<max('p','D','P');
    return 0;
}
