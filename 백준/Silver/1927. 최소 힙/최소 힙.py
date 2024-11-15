import sys
import heapq

input = sys.stdin.readline

heap = []

for _ in range(int(input())):
    n = int(input())

    if n == 0:
        if len(heap) == 0:
            print(0)
        else:
            min_val = heapq.heappop(heap)
            print(min_val)
    else:
        heapq.heappush(heap, n)
