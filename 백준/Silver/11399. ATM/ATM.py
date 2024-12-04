import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
m = {}
for i in range(n):
    m[i] = arr[i]


m = sorted(m.items(), key=lambda x: x[1])
ans = 0
tot = 0
for i in m:
    tot += i[1]
    ans += tot
print(ans)
