tot = 0
for _ in range(int(input())):
    h, b, k = map(int, input().split())
    if h < b:
        tot += (b - h) * k
print(tot)