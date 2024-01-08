import sys

input = sys.stdin.readline

A, B = map(int, input().split())
ans = 1
num = 1
for i in range(B):
    num = (num + (A - 2))
    ans += num

print(ans)