import math
import sys

input = sys.stdin.readline

t1 = int(input())
t2 = int(input())
a = 0
cnt = 2
while True:
    cnt += 1
    a = abs(t1 - t2)
    if a > t2:
        break
    t1 = t2
    t2 = a

print(cnt)