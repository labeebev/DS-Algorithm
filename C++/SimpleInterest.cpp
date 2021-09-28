#include<iostream>
using namespace std;

int main(){
    float p,r,t,s;
    cout<<"Enter Principal Amount : ";
    cin>>p;
    cout<<"Rate of Interest in % : ";
    cin>>r;
    cout<<"Time (in years) : ";
    cin>>t;
    s=p*r*t/100;
    cout<<"Simple Interest = "<<s;
    return 0;
}
