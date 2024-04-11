for _ in range(int(input())):
    a, b, c = map(int, input().split())

    if a + b == c or a - b == c or b - a == c or a * b == c or a / b == c or b / a == c:
        print("Possible")
    else:
        print("Impossible")