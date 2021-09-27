#include<iostream>
using namespace std;

int fact(int n){
    if(n==0){
        return 1;
    }
    return n*fact(n-1);
}

int main(){
    int n,res;
    cout<<"Enter the number : ";
    cin>>n;
    res=fact(n);
    cout<<"Factorial of "<<n<<" is : "<<res;
    return 0;
}
