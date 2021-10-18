#Average of N numbers
print("Enter number of elements : ",end='')
n=int(input())
print("Enter elements : ",end='')
temp=0
total=0
while(temp!=n):
    val=int(input())
    total=total+val
    temp=temp+1
avg=total/n;
print("Average :",avg)
