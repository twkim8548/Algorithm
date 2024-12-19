import sys

input = sys.stdin.readline

n = int(input())
dp = [(0, 0)] * (n + 1)
for i in range(1, n + 1):
    t, p = map(int, input().split())
    if t + i  - 1> n:
        continue
    dp[i] = (t, p)
    sub_dp = [dp[i]]
    for j in range(1, i):
        if i - j >= dp[j][0]:
            sub_dp.append((dp[i][0], max(dp[i][1], dp[i][1] + dp[j][1])))
    dp[i] = max(sub_dp, key=lambda x:x[1])
print(max(dp, key=lambda x:x[1])[1])