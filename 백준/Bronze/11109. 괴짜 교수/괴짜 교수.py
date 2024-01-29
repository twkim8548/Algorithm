import sys

input = sys.stdin.readline

N = int(input())
for _ in range(N):
    d, n, s, p = map(int, input().split())

    if d + n * p > n * s :
        print("do not parallelize")
    elif d + n * p < n * s :
        print("parallelize")
    else:
        print("does not matter")
