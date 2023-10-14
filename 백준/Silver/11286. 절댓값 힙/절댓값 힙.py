import heapq
import sys

input = sys.stdin.readline

hq = []
for _ in range(int(input())):
    n = int(input())
    if n == 0:
        print(heapq.heappop(hq)[1] if len(hq) else 0)
    else:
        heapq.heappush(hq, (abs(n), n))