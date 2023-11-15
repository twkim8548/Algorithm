import math
import sys

input = sys.stdin.readline

arr = [True, False, False]
for _ in range(int(input())):
    X, Y = map(int, input().split())
    tmp = arr[X - 1]
    arr[X - 1] = arr[Y - 1]
    arr[Y - 1] = tmp

for i, val in enumerate(arr):
    if val:
        print(i + 1)