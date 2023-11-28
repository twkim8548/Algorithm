import math
import sys

input = sys.stdin.readline


P, Q = map(int, input().split())

for i in range(P):
    for j in range(Q):
        if P % (i+1) == 0 and Q % (j+1) == 0:
            print(f"{i+1} {j+1}")