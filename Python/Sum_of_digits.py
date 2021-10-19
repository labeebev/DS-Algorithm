total=0
print("Enter the number :",end='')
n=int(input())
temp=n
while(temp!=0):
    r=temp%10
    total=total+r
    temp=temp//10
print(total)
