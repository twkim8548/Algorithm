import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)

s = int(input())
s_arr = list(map(int, input().split()))


def bfs(graph, start, find_arr):
    visited = [False for _ in range(len(graph))]
    for find in find_arr:
        visited[find] = True

    if visited[start]:
        return "Yes"
    queue = deque([start])

    visited[start] = True
    while queue:
        c = queue.popleft()

        if len(graph[c]) == 0:
            return 'yes'
        for i in graph[c]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)
    return "Yes"


print(bfs(graph, 1, s_arr))
