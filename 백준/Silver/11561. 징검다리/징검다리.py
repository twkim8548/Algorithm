import sys

input = sys.stdin.readline


for _ in range(int(input())):
    n = int(input())

    low = 1
    high = n

    while low <= high:
        mid = (low + high) // 2
        tot = mid * (mid + 1) // 2

        if tot <= n:
            low = mid + 1
        else:
            high = mid - 1

    print(low - 1)

