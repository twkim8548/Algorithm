a, b, c = 0, 0, 0
for i in range(int(input())):
    a1, b1, c1 = map(int, input().split())
    a += a1
    b += b1
    c += c1

    if a < 30 or b < 30 or c < 30:
        print("NO")
    else:
        v = min(a, b, c)
        print(v)
        a -= v
        b -= v
        c -= v