import sys
from collections import deque

input = sys.stdin.readline


def bfs(graph, s, visited, find_number):
    global ans
    queue = deque([(s, 0)])
    while queue:
        c = queue.popleft()
        visited[c[0]] = True

        if c[0] == find_number:
            ans = c[1]
            break

        for i in graph[c[0]]:
            if not visited[i]:
                visited[i] = True
                queue.append((i, c[1] + 1))


n = int(input())
a, b = map(int, input().split())
m = int(input())

graph = [[] for _ in range(n + 1)]
visited = [False for _ in range(n + 1)]
ans = -1

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

bfs(graph, a, visited, b)
print(ans)
