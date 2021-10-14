#include<iostream>
using namespace std;
int main(){
    int a,b,count,temp,n;
    a=0;
    b=1;
    cout<<"Enter n:";
    cin>>n;
    count=2;
    cout<<a<<" "<<b<<" ";
    while(count<n){
        temp=b;
        b=a+b;
        a=temp;
        cout<<b<<" ";
        count++;
    }
    return 0;
}
