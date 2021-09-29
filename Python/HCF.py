print("Enter two numbers: ",end='')
n1=int(input())
n2=int(input())
if(n1>n2):
    val=n1
else:
    val=n2
while(True):
    if((n1%val==0) and (n2%val==0)):
        break
    else:
        val=val-1
print("HCF of",n1,"and",n2,":",val)
