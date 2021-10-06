//Area of Triangle
#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int a,b,c;
    float s,area;
    cout<<"Enter 3 sides : ";
    cin>>a>>b>>c;
    s=(a+b+c)/2;
    area=sqrt(s*(s-a)*(s-b)*(s-c));
    cout<<"Area : "<<area;
    return 0;
}
