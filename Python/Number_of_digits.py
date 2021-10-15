print("Enter number : ",end='')
n=int(input())
temp=0
while(n!=0):
    n=n//10
    temp=temp+1
print(temp)
