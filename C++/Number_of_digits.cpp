#include<iostream>
using namespace std;
int main(){
    int n,temp;
    temp=0;
    cout<<"Enter number : ";
    cin>>n;
    while(n!=0){
        n=n/10;
        temp++;
    }
    cout<<temp;
    return 0;
}{
