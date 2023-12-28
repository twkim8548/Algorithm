import sys

input = sys.stdin.readline

N = int(input())

while N % 2 > 0:
    if N % 2 > 0:
        N = N // 2 + 1
    else:
        N = N // 2

print(N)