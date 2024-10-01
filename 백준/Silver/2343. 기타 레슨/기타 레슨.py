import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

low = max(arr)
high = sum(arr)
ans = high

while low <= high:
    mid = (low + high) // 2

    count = 1
    tot = 0
    for i in arr:
        if tot + i > mid:
            count += 1
            tot = 0
        tot += i

    if count <= m:
        ans = mid
        high = mid - 1
    else:
        low = mid + 1

print(ans)