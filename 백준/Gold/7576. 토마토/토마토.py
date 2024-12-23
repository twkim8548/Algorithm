import sys
from collections import deque

input = sys.stdin.readline


m, n = map(int, input().split())

graph = []
start = []
tot = 0

for i in range(n):
    graph.append([])
    tomato = list(map(int, input().split()))
    for j in range(m):
        graph[i].append(tomato[j])
        if tomato[j] == 1:
            start.append((i, j))
        if tomato[j] == 0:
            tot += 1


def bfs(graph, start, tot):
    day = 0
    cnt = 0
    find_arr = [(0, 1), (1, 0), (-1, 0), (0, -1)]

    queue = deque([start])

    while queue:
        c = queue.popleft() # 배열임
        if tot == cnt: # 토마토가 다익었는지 확인
            break
        day += 1
        next_tomato = [] # 다음 날짜에 익을 토마토들
        for tomato in c:
            for find in find_arr:
                if 0 <= tomato[0] + find[0] < n and 0 <= tomato[1] + find[1] < m: # 범위 넘는지 확인
                    if graph[tomato[0] + find[0]][tomato[1] + find[1]] == 0:  # 토마토가 있는 자리라면
                        graph[tomato[0] + find[0]][tomato[1] + find[1]] = 1
                        cnt += 1
                        next_tomato.append((tomato[0] + find[0], tomato[1] + find[1]))
        if tot != cnt and len(next_tomato) == 0: # 토마토는 다 안익었는데, 더이상 다음 토마토가 없으면 실패
            return -1
        queue.append(next_tomato)

    return day


if len(start) == 0:
    print(-1)
else:
    print(bfs(graph, start, tot))