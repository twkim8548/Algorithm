for _ in range(int(input())):
    ans = 0
    arr = []
    for _ in range(int(input())):
        arr.append(list(map(int, input().split())))
    k, d, a = map(int, input().split())

    for ar in arr:
        tot = ar[0] * k - ar[1] * d + ar[2] * a
        if tot > 0:
            ans += tot
    print(ans)
