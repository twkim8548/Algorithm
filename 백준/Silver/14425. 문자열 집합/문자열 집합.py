import sys

input = sys.stdin.readline

n, m = map(int, input().split())

arr = []

for i in range(n):
    str = input().strip()
    arr.append(str)

ans = 0
for _ in range(m):
    str = input().strip()
    if str in arr:
        ans += 1

print(ans)