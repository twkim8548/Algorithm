import sys
from collections import deque

input = sys.stdin.readline


def bfs(start):
    queue = deque([(start, 0)])
    visited[start] = 1

    while queue:
        top, cnt = queue.popleft()

        if top == k:
            return cnt

        for i in [top + 1, top * 2]:
            if not visited[i] and i <= k:
                visited[i] = 1
                queue.append((i, cnt + 1))


a, k = map(int, input().split())
visited = [0] * (k * 2 + 1)

print(bfs(a))
