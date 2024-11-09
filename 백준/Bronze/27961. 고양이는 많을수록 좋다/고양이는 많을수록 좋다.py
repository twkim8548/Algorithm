import sys
import math

input = sys.stdin.readline

n = int(input())
ans = 0
while n > 0:
    ans += 1
    if n == 1:
        n -= 1
    if math.ceil(n / 2) * 2 >= n:
        n = math.ceil(n / 2)
    else:
        n = n - 1

print(ans)