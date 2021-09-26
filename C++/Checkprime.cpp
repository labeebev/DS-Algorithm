#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number";
    cin>>n;
    if(n<=1){
        cout<<n<<" is neither prime nor composite";
    }
    else{
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                cout<<n<<" is not a prime";
                exit(0);
            }
            c++;
        }
        cout<<n<<" is a prime";
    }
    return 0;
}
