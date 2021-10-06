import math
print("Enter 3 sides :",end='')
a=int(input())
b=int(input())
c=int(input())
s=(a+b+c)/2.0;
area=math.sqrt(s*(s-a)*(s-b)*(s-c))
print("Area :",float(area))
