import sys
from math import ceil

input = sys.stdin.readline

N = int(input())
back = 0
front = 0
for _ in range(N):
    if int(input()) == 0:
        back += 1
    else:
        front += 1

print(min(front, back))