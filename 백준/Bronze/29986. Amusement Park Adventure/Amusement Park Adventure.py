import math
import sys

input = sys.stdin.readline

N, H = map(int, input().split())

arr = list(map(int, input().split()))

cnt = 0

for i in arr:
    if  i <= H:
        cnt += 1
print(cnt)