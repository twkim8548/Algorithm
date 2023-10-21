import sys

input = sys.stdin.readline

N, M, B = map(int, input().split())

arr = []
ans = []
first = 256
last = 0
tot = 0

for _ in range(N):
    line = list(map(int, input().split()))
    arr.append(line)
    mi = min(line)
    ma = max(line)
    if first > mi:
        first = mi
    if last < ma:
        last = ma
    tot = tot + sum(line)

for i in range(first, last + 1):
    if tot + B >= N * M * i:
        time = 0
        for j in arr:
            for k in j:
                if i < k:
                    time = time + ((k - i) * 2)
                else:
                    time = time + (i - k)
        ans.append((time, i))

ans.sort(key=lambda x: (x[0], -x[1]))

print(f"{ans[0][0]} {ans[0][1]}")
