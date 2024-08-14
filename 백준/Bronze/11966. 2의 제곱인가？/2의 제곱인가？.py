import math

n = int(input())

if math.ceil(math.log2(n)) == int(math.log2(n)) :
    print(1)
else:
    print(0)