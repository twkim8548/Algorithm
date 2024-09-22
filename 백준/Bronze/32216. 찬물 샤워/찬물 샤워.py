import sys
input = sys.stdin.readline

n, k, t = map(int, input().split())
arr = list(map(int, input().split()))
ans = t

ansArr = []

for i in arr:
    if ans < k:
        ans = ans + i + abs(ans - k)
    elif ans > k:
        ans = ans + i - abs(ans - k)
    else:
        ans = ans + i
    ansArr.append(ans)

res = 0
for i in ansArr:
    res += abs(i - k)

print(res)
