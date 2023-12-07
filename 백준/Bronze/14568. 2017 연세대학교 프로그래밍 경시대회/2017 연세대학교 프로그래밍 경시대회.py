import math
import sys

input = sys.stdin.readline

N = int(input())

A, B, C = 0,0,0
ans = 0

for A in range(0, N+1):
    for B in range(0, N+1):
        for C in range(0, N+1):
            if A+B+C == N:
                if A >= B + 2:
                    if A > 0 and B > 0 and C > 0:
                        if C % 2 == 0:
                            ans += 1

print(ans)
