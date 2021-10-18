//Average of N numbers
#include<iostream>
using namespace std;
int main(){
    int n,temp,val,sum;
    float avg;
    cout<<"Enter number of elements : ";
    cin>>n;
    cout<<"Enter elements :";
    temp=0;
    sum=0;
    while(temp!=n){
        cin>>val;
        sum=sum+val;
        temp++;
    }
    avg=sum/n;
    cout<<"Average : "<<avg;
    return 0;
}
