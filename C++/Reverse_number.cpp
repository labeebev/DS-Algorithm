#include<iostream>
using namespace std;
int main(){
    int n,r,res;
    res=0;
    cout<<"Enter number: ";
    cin>>n;
    while(n!=0){
        r=n%10;
        res=res*10+r;
        n=n/10;
    }
    cout<<res;
    return 0;
}
