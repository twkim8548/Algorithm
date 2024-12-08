import sys

input = sys.stdin.readline

for i in range(int(input())):

    n = int(input())

    if n == 0:
        print(1, 0)
        continue
    else:
        dp = [(0,0)] * (n + 1)
        dp[0] = (1, 0)
        dp[1] = (0, 1)

        for i in range(2, n+1):
            dp[i] = (dp[i-1][0] + dp[i-2][0], dp[i-1][1] + dp[i-2][1])
        print(dp[n][0], dp[n][1])
