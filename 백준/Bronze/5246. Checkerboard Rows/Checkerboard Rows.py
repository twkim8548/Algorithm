import math
import sys

input = sys.stdin.readline

for _ in range(int(input())):
    cnt = [0 for j in range(8)]
    arr = list(map(int, input().split()))
    N = arr[0]
    for i in range(N):
        a = arr[i * 2 + 1]
        b = arr[i * 2 + 2]
        cnt[b - 1] += 1

    print(max(cnt))