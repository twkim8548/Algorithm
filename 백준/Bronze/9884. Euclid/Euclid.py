x, y = map(int, input().split())

a = x
b = y

while a != b:
    x = a
    y = b
    a = max(x, y) - min(x, y)
    b = min(x, y)

print(a)
