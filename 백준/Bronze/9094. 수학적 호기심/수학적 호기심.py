for _ in range(int(input())):
    n, m = map(int, input().split())
    tot = 0
    for a in range(1, n+1):
        for b in range(a + 1, n):
            if ((a ** 2) + (b ** 2) + m) % (a * b) == 0:
                tot += 1
    print(tot)
