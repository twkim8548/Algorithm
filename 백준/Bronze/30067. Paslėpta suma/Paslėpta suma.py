import math
import sys

input = sys.stdin.readline

arr = []
for i in range(10):
    arr.append(int(input()))

tot = sum(arr)
for i in arr:
    arr.remove(i)
    if i == sum(arr):
        print(i)
        break

    arr.append(i)