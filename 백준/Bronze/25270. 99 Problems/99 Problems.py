n = int(input())

if n < 149:
    print(99)
else:
    small = int(f"{(n // 100) - 1}99")
    big = int(f"{(n // 100)}99")
    if n - small < big - n:
        print(small)
    else:
        print(big)
