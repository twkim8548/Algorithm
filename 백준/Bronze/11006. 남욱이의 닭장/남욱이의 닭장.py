for _ in range(int(input())):
    n, m = map(int, input().split())

    print(m * 2 - n, m - (m * 2 - n))