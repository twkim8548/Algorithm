import sys

input = sys.stdin.readline

n = int(input())
dp = [[0,0,0]] * (n)

for i in range(n):
    dp[i] = list(map(int, input().split()))

for i in range(1, n):
    dp[i][0] = dp[i][0] + min(dp[i-1][1], dp[i-1][2])
    dp[i][1] = dp[i][1] + min(dp[i-1][0], dp[i-1][2])
    dp[i][2] = dp[i][2] + min(dp[i-1][0], dp[i-1][1])

print(min(dp[n-1]))
