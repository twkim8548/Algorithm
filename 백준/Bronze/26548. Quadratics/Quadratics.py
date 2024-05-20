for i in range(int(input())):
    a, b, c = map(float, input().split())
    print('{:.3f}'.format((-b + ((b ** 2) - (4 * a * c)) ** (1/2)) / (2 * a)), end=", ")
    print('{:.3f}'.format((-b - ((b ** 2) - (4 * a * c)) ** (1/2)) / (2 * a)))