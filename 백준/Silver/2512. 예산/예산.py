import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
m = int(input())

low = 1
high = max(arr)
ans = high

while low <= high:
    mid = (low + high) // 2
    tot = 0
    for i in arr:
        if i <= mid:
            tot += i
        else:
            tot += mid
    if tot > m:
        high = mid - 1
    else:
        low = mid + 1
        ans = mid

print(ans)