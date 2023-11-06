import sys
from datetime import datetime

input = sys.stdin.readline

N, M = map(int, input().split())
arr = []
arr2 = []
for i in range(N):
    arr.append(list(map(int, input().split())))
for i in range(N):
    arr2.append(list(map(int, input().split())))

for i in range(N):
    for j in range(M):
        print(arr[i][j] + arr2[i][j], end=" ")
    print()


