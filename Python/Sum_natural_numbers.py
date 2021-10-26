def natural(n):
    n=(n*(n+1)/2)
    return n

print("Enter n :",end=' ')
n=int(input())
print("Sum of first",n,"natural numbers :",natural(n))
