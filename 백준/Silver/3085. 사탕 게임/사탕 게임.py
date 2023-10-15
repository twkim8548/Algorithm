import sys

input = sys.stdin.readline

def hor_search(arr):
    ans = 1
    for i in range(N):
        cnt = 1
        for j in range(N - 1):
            if arr[i][j] == arr[i][j+1]:
                cnt += 1
                ans = max(ans, cnt)
            else:
                cnt = 1
    return ans


def ver_search(arr):
    ans = 1
    for i in range(N):
        tmpArr = list(arr[k][i] for k in range(N))
        cnt = 1
        for k in range(N - 1):
            if tmpArr[k] == tmpArr[k+1]:
                cnt += 1
                ans = max(cnt, ans)
            else:
                cnt = 1
    return ans


N = int(input())
arr = [list(input().strip()) for _ in range(N)]
ans = max(ver_search(arr), hor_search(arr))

for i in range(N):
    for j in range(N - 1):
        if arr[i][j] != arr[i][j+1]:
            tmp = arr[i][j]
            arr[i][j] = arr[i][j+1]
            arr[i][j+1] = tmp

            cnt = max(ver_search(arr), hor_search(arr))
            if cnt > ans:
                ans = cnt
            arr[i][j+1] = arr[i][j]
            arr[i][j] = tmp

        if arr[j][i] != arr[j+1][i]:
            tmp = arr[j][i]
            arr[j][i] = arr[j+1][i]
            arr[j+1][i] = tmp
            cnt = max(ver_search(arr), hor_search(arr))
            if cnt > ans:
                ans = cnt
            arr[j+1][i] = arr[j][i]
            arr[j][i] = tmp

print(ans)
