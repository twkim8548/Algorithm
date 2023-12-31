import math
import sys

input = sys.stdin.readline

N = int(input())
for _ in range(N):
    W, H = map(int, input().split())
    print(W * H // 2)