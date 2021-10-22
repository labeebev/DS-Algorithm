def smallest(a,b,c):
    small=a
    if(b<small):
        small=b
    if(c<small):
        small=c
    return small
def largest(a,b,c):
    large=a
    if(b>large):
        large=b
    if(c>large):
        large=c
    return large
a,b,c=[int(x) for x in input("Enter three numbers :").split()]
print("Largest :",largest(a,b,c))
print("Smallest:",smallest(a,b,c))
