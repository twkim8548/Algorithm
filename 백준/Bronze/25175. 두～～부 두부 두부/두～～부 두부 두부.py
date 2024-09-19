n, m, a = map(int, input().split())

result = 0

while a < 0:
    a += n

result = (((a - 3) % n) + m)
if result > n:
    result %= n
print(result)