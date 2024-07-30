n = int(input())
arr = list(map(int, input().split()))
tot = 0
ans = 0
for i in arr:
    if i > 0:
        tot += 1
    else:
        tot = 0
    if tot > ans:
        ans = tot
print(ans)