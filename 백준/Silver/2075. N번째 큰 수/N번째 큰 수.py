import heapq
import sys

input = sys.stdin.readline

N = int(input())
q = []

for i in range(N):
    str = input().split(" ")
    for j in range(N):
        heapq.heappush(q, int(str[j]))
        if len(q) > N:
            heapq.heappop(q)

print(q[0])