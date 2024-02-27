n, k, x, y = map(int, input().split())
tot = 0
for _ in range(n):
    xi, yi = map(int, input().split())
    if ((xi - x) ** 2 + (yi - y) ** 2) ** 0.5 > k: tot += 1

print(tot)
