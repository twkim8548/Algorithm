import math
import sys

input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
    arr.append(int(input()))

if max(arr) == arr[0]:
    print("S")
else:
    print("N")
