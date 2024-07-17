n, m = map(int, input().split())

for i in range(n):
    for j in range(m):
        if i % 2 == 0:
            if j % 2 == 0:
                print("*", end='')
            else:
                print(".", end='')
        else:
            if j % 2 == 0:
                print(".", end='')
            else:
                print("*", end='')
    print()