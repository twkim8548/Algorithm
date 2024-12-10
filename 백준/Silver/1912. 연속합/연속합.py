import sys

input = sys.stdin.readline

n = int(input())
arr = [0] + list(map(int, input().split()))

dp = [-1001] * (n+1)
dp[1] = arr[1]

for i in range(2, n+1):
    dp[i] = max(dp[i-1] + arr[i], arr[i])

print(max(dp))