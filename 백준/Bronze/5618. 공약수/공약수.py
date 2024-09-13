def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)


n = int(input())
mlist = list(map(int, input().split()))
g = gcd(mlist[0], gcd(mlist[1], mlist[-1]))

for i in range(1, g // 2 + 1):
    if g % i == 0:
        print(i)
print(g)
