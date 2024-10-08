import sys

input = sys.stdin.readline

n = int(input())

if n == 1:
    print(0)
else:
    dp = [0] * (n + 1)
    dp[1] = 0
    dp[2] = 1

    ans = 0

    for i in range(3, n + 1):
        dp[i] = dp[i - 1] + (i - 1)
    print(dp[n])
