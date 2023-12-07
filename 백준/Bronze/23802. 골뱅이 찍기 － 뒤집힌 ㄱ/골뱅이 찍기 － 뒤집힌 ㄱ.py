import math
import sys

input = sys.stdin.readline

N = int(input())

for i in range(N * 5):
    if i < N:
        for _ in range(N * 5):
            print("@", end="")
    else:
        for _ in range(N):
            print("@", end="")
    print()
