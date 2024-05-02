n = int(input())

arr = list(map(int, input().split()))
idx = 0
num = 1
ans = 0

for x in arr:
    if x != num:
        ans += 1
    else:
        num += 1

print(ans)