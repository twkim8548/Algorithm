import sys
from datetime import datetime

input = sys.stdin.readline

N = int(input())
cnt = 0
for _ in range(N):
    str = input().strip()
    if ('OI' in str) or ('01' in str):
        cnt += 1

print(cnt)