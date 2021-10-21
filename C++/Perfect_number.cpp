#include<iostream>
using namespace std;
int main(){
    int i=1,n;
    int sum=0;
    cout<<"Enter the number :";
    cin>>n;
    while(i<n){
        if(n%i==0)
        sum=sum+i;
        i++;
    }
    if(sum==n){
        cout<<n<<" is a Perfect number";}
    else{
        cout<<n<<" is not a Perfect number";}
    
    return 0;
}
