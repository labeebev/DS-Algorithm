#include<iostream>
using namespace std;

int main(){
    int n1,n2,val;
    cout<<"Enter the numbers : ";
    cin>>n1>>n2;
    if(n1>n2){
        val=n1;
    }else{
        val=n2;
    }
    while(true){
        if((val%n1==0) && (val%n2==0)){
            break;
        }
        else{
            val++;
        }
    }
    cout<<"LCM is : "<<val;
    return 0;
}
