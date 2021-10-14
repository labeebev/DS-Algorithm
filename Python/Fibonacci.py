print("Enter n:",end='')
n=int(input())
a=0
b=1
count=2
print(a,b,end=' ')
while(count<n):
    temp=b
    b=a+b
    a=temp
    print(b,end=' ')
    count=count+1
