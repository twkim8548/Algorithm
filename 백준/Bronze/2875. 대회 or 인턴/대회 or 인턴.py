import sys

input = sys.stdin.readline

N, M, K = map(int,input().split())

for i in range(K):
    if N//2 >= M:
        N -= 1
    else:
        M -= 1

print(min(N//2, M))