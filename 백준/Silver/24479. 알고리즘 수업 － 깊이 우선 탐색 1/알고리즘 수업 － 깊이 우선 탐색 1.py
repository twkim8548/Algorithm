import sys
sys.setrecursionlimit(150000)
input = sys.stdin.readline

n, m, r = map(int, input().split())
arr = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)
cnt = 1


def dfs(v, r, visited):
    global cnt
    visited[r] = cnt

    for x in v[r]:
        if visited[x] == 0:
            cnt += 1
            dfs(v, x, visited)


for _ in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)

for i in range(n + 1):
    arr[i].sort()


dfs(arr, r, visited)

for i in range(1, n + 1):
    print(visited[i])
