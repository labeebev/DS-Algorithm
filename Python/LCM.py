print("Enter two numbers: ",end='')
n1=int(input())
n2=int(input())
if(n1>n2):
    val=n1
else:
    val=n2
while(True):
    if((val%n1==0) and (val%n2==0)):
        break
    else:
        val=val+1
print("LCM of",n1,"and",n2,":",val)
