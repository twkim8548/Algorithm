import sys
input = sys.stdin.readline

k, n = map(int, input().split())
arr = [int(input()) for _ in range(k)]

low = 0
high = max(arr)
ans = high

while low <= high:
    mid = (low + high) // 2
    tot = 0
    for i in arr:
        if mid > 0:
            tot += i // mid
        else:
            tot += i

    if tot >= n:
        ans = mid
        low = mid + 1
    else:
        high = mid - 1

print(ans)
