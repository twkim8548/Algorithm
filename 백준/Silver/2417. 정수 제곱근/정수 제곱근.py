import sys

input = sys.stdin.readline

n = int(input())

low = 1
high = n
ans = high

while low <= high:
    mid = (low + high) // 2

    if mid * mid >= n:
        ans = mid
        high = mid - 1
    else:
        low = mid + 1
print(ans)