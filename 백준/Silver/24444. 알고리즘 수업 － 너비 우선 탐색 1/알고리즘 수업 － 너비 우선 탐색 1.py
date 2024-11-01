import sys
from collections import deque

input = sys.stdin.readline


n, m, r = map(int, input().split())
visited = [0] * (n + 1)
arr = [[] for _ in range(n + 1)]


def bfs(graph, visited, r):
    cnt = 1
    queue = deque([r])
    visited[r] = cnt
    cnt += 1
    while queue:
        u = queue.popleft()
        graph[u].sort()
        for v in graph[u]:
            if visited[v] == 0:
                visited[v] = cnt
                cnt += 1
                queue.append(v)


for i in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)


bfs(arr, visited, r)

for i in range(1, n + 1):
    print(visited[i])