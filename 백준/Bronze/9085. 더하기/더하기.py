for _ in range(int(input())):
    n = int(input())
    tot = 0
    for i in map(int, input().split()):
        tot += i
    print(tot)