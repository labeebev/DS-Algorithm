print("Enter two numbers: ",end='')
n1=int(input())
n2=int(input())
a=n1
b=n2
while(b!=0):
    temp=b
    b=a%b
    a=temp
hcf=a
lcm=n1*n2//hcf
print("LCM of",n1,n2,":",lcm)
print("HCF of",n1,n2,":",hcf)
