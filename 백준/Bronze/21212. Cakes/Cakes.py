import sys

input = sys.stdin.readline

N = int(input())
ans = 0

for i in range(N):
    x, y = map(int, input().split())
    if i == 0:
        ans = y // x
    else:
        if ans > y // x:
            ans = y // x
print(ans)

