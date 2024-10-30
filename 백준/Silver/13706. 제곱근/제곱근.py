import sys
import math

input = sys.stdin.readline

n = int(input())

low = 1
high = n

while low <= high:
    mid = (low + high) // 2

    if mid * mid < n:
        low = mid + 1
    else:
        high = mid - 1

print(low)