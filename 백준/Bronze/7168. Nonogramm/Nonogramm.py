import sys

input = sys.stdin.readline

N, M = map(int, input().split())

arr = []

for _ in range(N):
    arr.append(list(input().strip()))

for i in range(N):
    cnt = 0
    isShow = False
    for index, nono in enumerate(arr[i]):
        if nono == '#':
            cnt += 1
        if index == len(arr[i]) - 1 and ((cnt == 0 and not isShow) or cnt > 0):
            print(cnt, end=' ')
            cnt = 0
        if nono == '.' and cnt > 0:
            print(cnt, end=' ')
            isShow = True
            cnt = 0
    print()

for i in range(M):
    cnt = 0
    isShow = False
    for j in range(N):
        if arr[j][i] == '#':
            cnt += 1
        if j == N - 1 and ((cnt == 0 and not isShow) or cnt > 0):
            print(cnt, end=' ')
            cnt = 0
        if arr[j][i] == '.' and cnt > 0:
            print(cnt, end=' ')
            isShow = True
            cnt = 0
    print()
