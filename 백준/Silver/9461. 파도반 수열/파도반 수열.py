import sys

input = sys.stdin.readline

# 1, 1, 1, 2, 2, 3, 4, 5, 7, 9
dp = [0] * 101
dp[1] = 1
dp[2] = 1
dp[3] = 1
dp[4] = 2
dp[5] = 2
for i in range(6, 101):
    dp[i] = dp[i-5] + dp[i-1]


for i in range(int(input())):
    n = int(input())
    print(dp[n])