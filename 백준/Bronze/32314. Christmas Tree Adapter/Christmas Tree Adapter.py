import sys
from collections import deque

input = sys.stdin.readline


a = int(input())
w, v = map(int, input().split())

if w/v >= a:
    print(1)
else:
    print(0)