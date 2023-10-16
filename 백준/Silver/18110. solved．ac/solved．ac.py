import math
import sys

input = sys.stdin.readline


# def round(n):
#     if n - int(n) < 0.4:
#         return int(n)
#     else:
#         return math.ceil(n)


n = int(input())
if n == 0:
    print(0)
else:
    exc = round((n * 15 / 100) + 0.0000001)

    arr = [int(input()) for _ in range(n)]
    arr = sorted(arr)
    tot = 0
    c = 0

    for i in range(exc, n-exc):
        tot += arr[i]
        c += 1

    print(round((tot / c) + 0.0000001))
