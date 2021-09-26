print("Enter the number: ")
n=int(input())
if(n<=1):
    print(n, " is neither prime nor composite")
else:
    c=2
    while(c*c<=n):
        if(n%c==0):
            print(n," is not a prime")
            exit()
        c=c+1
    print(n," is a prime")
