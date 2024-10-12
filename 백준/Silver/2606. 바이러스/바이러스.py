import sys
from collections import deque

input = sys.stdin.readline

computer = int(input())
n = int(input())
graph = [[] for _ in range(computer + 1)]
visited = [False] * (computer + 1)
ans = 0
def bfs(graph, start, visited):
    queue = deque([start])
    global ans

    while queue:
        v = queue.popleft()
        visited[v] = True

        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True
                ans += 1
    print(ans)


for _ in range(n):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

bfs(graph, 1, visited)