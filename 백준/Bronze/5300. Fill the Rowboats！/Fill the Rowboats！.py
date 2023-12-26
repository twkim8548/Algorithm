import sys

input = sys.stdin.readline

N = int(input())

for i in range(1, N + 1):
    if i % 6 == 0 or i == N:
        print(i, end=" Go! ")
    else:
        print(i, end=" ")