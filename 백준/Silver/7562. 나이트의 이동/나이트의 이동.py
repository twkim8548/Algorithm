import sys
from collections import deque

input = sys.stdin.readline


def bfs(start, end, l):
    graph = [(1,2), (2,1), (2, -1) , (1, -2), (-2, -1), (-1, -2), (-1, 2), (-2, 1)]
    visited = [[False for _ in range(l)] for _ in range(l)]
    queue = deque([(start, 0)])

    visited[start[0]][start[1]] = True

    while queue:
        c = queue.popleft()
        if c[0][0] == end[0] and c[0][1] == end[1]:
            return c[1]
        next_points = []
        for i in graph:
            if 0 <= c[0][0] + i[0] < l and 0 <= c[0][1] + i[1] < l:
                next_points.append((c[0][0] + i[0], c[0][1] + i[1]))

        for j in next_points:
            if not visited[j[0]][j[1]]:
                visited[j[0]][j[1]] = True
                queue.append((j, c[1] + 1))


for _ in range(int(input())):
    l = int(input())
    current_x, current_y = map(int, input().split())
    target_x, target_y = map(int, input().split())

    ans = bfs((current_x, current_y), (target_x, target_y), l)
    print(ans)