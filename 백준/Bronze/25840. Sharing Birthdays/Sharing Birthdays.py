import math
import sys

input = sys.stdin.readline

arr = []
N = int(input())

for _ in range(N):
    birth = input().strip()
    if not birth in arr:
        arr.append(birth)

print(len(arr))