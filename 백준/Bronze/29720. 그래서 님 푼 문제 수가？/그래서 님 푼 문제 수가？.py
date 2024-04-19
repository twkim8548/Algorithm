n, m, k = map(int, input().split())

ans1 = 0
print(max(0, n - (m * k)), max(0, n - (m * (k - 1)) - 1))
