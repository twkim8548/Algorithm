r, b = map(int, input().split())

l_plus_w = (r+4) // 2
lw = r + b

for i in range(1, l_plus_w + 1):
    if (l_plus_w - i) * i == lw:
        print(max(i, l_plus_w - i), min(i, l_plus_w - i))
        break
