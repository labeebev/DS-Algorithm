#include<iostream>
using namespace std;
int sumNatural(int n){
    n=(n*(n+1))/2;
    return n;
}
int main(){
    int n;
    cout<<"Enter n : ";
    cin>>n;
    cout<<"Sum of first "<<n<<" natural numbers : "<<sumNatural(n);
    return 0;
}
