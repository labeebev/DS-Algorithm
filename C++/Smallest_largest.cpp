#include<iostream>
using namespace std;
int smallest(int a, int b, int c){
    int min=a;
    if(b<min){
        min=b;
    }
    if(c<min){
        min=c;
    }
    return min;
}
int largest(int a, int b, int c){
    int max=a;
    if(b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }
    return max;
}
int main(){
    int a,b,c;
    cout<<"Enter 3 numbers :";
    cin>>a>>b>>c;
    cout<<"Largest : "<<largest(a,b,c)<<endl;
    cout<<"Smallest: "<<smallest(a,b,c);
    return 0;
}
