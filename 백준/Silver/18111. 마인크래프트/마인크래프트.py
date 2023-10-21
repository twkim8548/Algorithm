import sys

input = sys.stdin.readline

N, M, B = map(int, input().split())

arr = []
ans = []
first = 256
last = 0
tot = 0
heights = [0] * 257

for i in range(N):
    line = list(map(int, input().split()))
    arr.append(line)
    mi = min(line)
    ma = max(line)
    if first > mi:
        first = mi
    if last < ma:
        last = ma
    tot = tot + sum(line)
    for j in range(M):
        heights[arr[i][j]] += 1

for i in range(first, last + 1):
    if tot + B >= N * M * i:
        time = 0
        for j in range(257):
            if heights[j] > 0:
                if i < j:
                    time = time + ((j - i) * 2 * heights[j])
                else:
                    time = time + ((i - j) * heights[j])
        ans.append((time, i))

ans.sort(key=lambda x: (x[0], -x[1]))

print(f"{ans[0][0]} {ans[0][1]}")
