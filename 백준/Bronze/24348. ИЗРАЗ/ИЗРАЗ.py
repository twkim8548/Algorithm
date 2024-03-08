a, b, c = map(int, input().split())
ans = 0

ans = max(ans, a + (b * c))
ans = max(ans, b + (a * c))
ans = max(ans, c + (a * b))

print(ans)
