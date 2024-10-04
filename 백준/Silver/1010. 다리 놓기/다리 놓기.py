import sys

input = sys.stdin.readline


def fac(n):
    dp = [0] * (n + 1)
    dp[0] = 1
    dp[1] = 1
    for i in range(2, n + 1):
        dp[i] = dp[i-1] * i

    return dp[n]


for i in range(int(input())):
    n, m = map(int, input().split())
    if n == m:
        print(1)
    else:
        mCn = fac(m) // (fac(m-n) * fac(n))
        print(mCn)
