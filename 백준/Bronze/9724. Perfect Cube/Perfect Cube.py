for j in range(int(input())):
    a, b = map(int, input().split())
    tot = 0
    for i in range(int(a ** (1/3)), int(b ** (1/3) + 1)):
        if a <= i ** 3 <= b:
            tot += 1
    print(f"Case #{j + 1}: {tot}")