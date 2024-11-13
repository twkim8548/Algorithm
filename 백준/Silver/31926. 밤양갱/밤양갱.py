import sys

input = sys.stdin.readline


n = int(input())
cnt = 0
ans = 1

for i in range(n):
    ans *= 2
    cnt += 1
    if ans > n:
        break

print(8 + cnt + 1)

