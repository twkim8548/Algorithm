for _ in range(int(input())):
    n, k = map(int, input().split())
    tot = 0
    for num in list(map(int, input().split())):
        tot += num // k
    print(tot)