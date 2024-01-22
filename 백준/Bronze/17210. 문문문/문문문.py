import sys
from math import ceil

input = sys.stdin.readline

N = int(input())
first = int(input())

if N >= 6:
    print("Love is open door")
else:
    for _ in range(N - 1):
        if first == 0:
            print(1)
            first = 1
        else:
            print(0)
            first = 0