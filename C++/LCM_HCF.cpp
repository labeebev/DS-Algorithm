#include<iostream>
using namespace std;

int main(){
    int n1,n2,a,b,temp,lcm,hcf;
    cout<<"Enter the numbers : ";
    cin>>n1>>n2;
    a=n1;
    b=n2;
    while(b!=0){
        temp=b;
        b=a%b;
        a=temp;
    }
    hcf=a;
    lcm=n1*n2/hcf;
    cout<<"LCM of "<<n1<<" "<<n2<<" is :"<<lcm<<endl;
    cout<<"HCF of "<<n1<<" "<<n2<<" is :"<<hcf;
    return 0;
}
