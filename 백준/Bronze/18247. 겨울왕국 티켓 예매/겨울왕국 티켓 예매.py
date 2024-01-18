import sys

input = sys.stdin.readline
# ord('A') = 65
for _ in range(int(input())):
    N, M = map(int, input().split())
    ans = 0
    cnt = 1
    for i in range(65, 65 + N):
        for j in range(1, M + 1):
            if i == 76 and j == 4:
                ans = cnt
            cnt += 1
    if ans == 0:
        print(-1)
    else:
        print(ans)
