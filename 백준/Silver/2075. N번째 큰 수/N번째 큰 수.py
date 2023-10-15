import heapq
import sys

input = sys.stdin.readline

N = int(input())
q = []

for i in range(N):
    str = input().split(" ")
    for j in range(N):
        if len(q) >= N:
            heapq.heappushpop(q, int(str[j]))
        else:
            heapq.heappush(q, int(str[j]))

print(q[0])