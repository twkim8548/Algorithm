import sys

input = sys.stdin.readline

t = int(input())

# 1 -> 1
# 2 -> 1+1, 2 -> 2
# 3 -> 1+1+1, 1+2, 2+1, 3 -> 4
# 4 -> 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1 -> 7
# 5 -> 1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1, 2+1+2, 2+2+1, 3+2, 2+3 -> 13
# 6 -> 24
# 7 -> 44

for i in range(t):
    n = int(input())
    dp = [0] * 11
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for i in range(4, n + 1):
        dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]
    print(dp[n])
