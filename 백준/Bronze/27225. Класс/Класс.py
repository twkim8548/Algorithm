n = int(input())
m = int(input())

print(min(n, m) * 2 + (1 if (n+m) % 2 == 1 else 0))