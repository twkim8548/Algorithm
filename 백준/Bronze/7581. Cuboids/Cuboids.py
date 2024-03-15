while True:
    l, w, h, v = map(int, input().split())
    if l == 0 and w == 0 and h == 0 and v == 0:
        break

    if l == 0:
        l = v // (w * h)
    elif w == 0:
        w = v // (l * h)
    elif h == 0:
        h = v // (l * w)
    else:
        v = l * w * h

    print(l, w, h, v)