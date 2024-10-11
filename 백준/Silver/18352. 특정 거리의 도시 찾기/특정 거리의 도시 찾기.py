import sys
from collections import deque

input = sys.stdin.readline


def bfs(graph, start, visited):
    queue = deque([start])

    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if visited[i] == -1:
                visited[i] = visited[v] + 1
                queue.append(i)


n, m, k, x = map(int, input().split())

visited = [-1] * (n + 1)
visited[x] = 0

graph = [ [] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)

bfs(graph, x, visited)

if visited.count(k):
    for i in range(1, n + 1):
        if visited[i] == k:
            print(i)
else:
    print(-1)
