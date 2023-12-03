import math
import sys

input = sys.stdin.readline

arr = list(map(int, input().split()))
arr.sort()
print(f"{arr[0]} {arr[2]} {arr[1]} {arr[3]}")