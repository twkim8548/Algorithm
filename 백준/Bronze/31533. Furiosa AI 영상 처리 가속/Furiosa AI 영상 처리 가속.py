a = int(input())
m, n = map(float, input().split())
if m > n:
    m, n = n, m
print(min(max(n / a, m), (m / a) * 2))