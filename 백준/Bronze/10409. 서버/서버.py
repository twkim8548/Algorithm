n, t = map(int, input().split())
arr = list(map(int, input().split()))
tot = 0
cnt = 0
for num in arr:
    tot += num
    if tot > t:
        break
    cnt += 1

print(cnt)