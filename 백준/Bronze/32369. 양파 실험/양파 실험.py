n, a, b = map(int, input().split())

x, y = 1, 1

for i in range(n):
    x += a
    y += b

    if y > x:
        x, y = y, x

    if x == y:
        y -= 1

print(x, y)