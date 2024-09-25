for i in range(int(input())):
    g, c, e = map(int, input().split())

    ans = 0
    if g == 1:
        ans = ((e - c))
    elif g == 2:
        ans = ((e - c) * 3)
    elif g == 3:
        ans = ((e - c) * 5)

    if c >= e:
        ans = 0
    print(ans)