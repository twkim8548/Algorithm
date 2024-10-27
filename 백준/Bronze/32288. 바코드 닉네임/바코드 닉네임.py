import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

for c in input().strip():
    if c == "I":
        print('i', end='')
    else:
        print('L', end='')