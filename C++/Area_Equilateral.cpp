//Area of equilateral triangle
#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int s;
    cout<<"Enter side :";
    cin>>s;
    float area = sqrt(3)*s*s/4;
    cout<<"Area : "<<area;
    return 0;
}
