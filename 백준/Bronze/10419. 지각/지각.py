for _ in range(int(input())):
    d = int(input())
    x = 0
    while True:
        if (x ** 2) + x > d:
            break
        x += 1
    print(x - 1)
