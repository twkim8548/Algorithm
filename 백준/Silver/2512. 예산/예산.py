import sys

input = sys.stdin.readline


n = int(input())
arr = list(map(int, input().split()))
m = int(input())

low = 1
high = max(arr)

while low <= high:
    mid = (low + high) // 2

    tot = 0
    for money in arr:
        if money > mid:
            tot += mid
        else:
            tot += money

    if tot <= m:
        low = mid + 1
    else:
        high = mid - 1


print(low - 1)