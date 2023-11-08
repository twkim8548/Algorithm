import sys
from datetime import datetime

input = sys.stdin.readline

N = int(input())
arr = []
for _ in range(N):
    t, l = map(int, input().split())
    arr.append(t + l)

print(min(arr))