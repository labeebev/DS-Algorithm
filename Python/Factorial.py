def fact(n):
    if(n==0):
        return 1
    return n*fact(n-1)

print("Enter the number : ",end='')
n=int(input())
val=fact(n)
print("Factorial of ",n," :",val)
