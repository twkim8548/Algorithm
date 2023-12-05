import math
import sys

input = sys.stdin.readline

cnt = 0
N = int(input())
arr = []
for _ in range(N):
    arr.append(input())
for i in range(N):
    ans = input()
    if ans == arr[i]:
        cnt += 1

print(cnt)