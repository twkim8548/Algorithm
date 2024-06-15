odd = 0
even = 0

n = int(input())
for c in input():
    i = int(c)
    if i % 2 == 0:
        even += 1
    else:
        odd += 1
        
if even > odd:
    print(0)
elif even < odd:
    print(1)
else:
    print(-1)
    
