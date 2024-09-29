import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = list(map(int, input().split()))

low = 1
high = max(arr)
ans = 0

while low <= high:
    mid = (low + high) // 2
    sum_tree = 0

    for i in arr:
        if mid < i:
            sum_tree += i - mid

    if sum_tree >= m:
        ans = mid
        low = mid + 1
    else:
        high = mid - 1

print(ans)