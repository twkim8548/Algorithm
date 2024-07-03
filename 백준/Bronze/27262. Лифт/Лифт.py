n, k, a, b = map(int, input().split())

ans1 = (k - 1)*b + (n-1)*b
ans2 = (n-1)*a

print(ans1, ans2)