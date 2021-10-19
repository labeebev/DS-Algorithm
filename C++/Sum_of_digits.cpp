#include<iostream>
using namespace std;
int main(){
    int n,r,sum=0,temp;
    cout<<"Enter the number : ";
    cin>>n;
    temp=n;
    while(temp!=0){
        r=temp%10;
        sum=sum+r;
        temp=temp/10;
    }
    cout<<sum;
    return 0;
}
