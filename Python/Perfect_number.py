i=1
total=0
print("Enter the number :",end='')
n=int(input())
while(i<n):
    if(n%i==0):
        total=total+i
    i=i+1
if(total==n):
    print(n,"is perfect")
else:
    print(n,"is not perfect")
