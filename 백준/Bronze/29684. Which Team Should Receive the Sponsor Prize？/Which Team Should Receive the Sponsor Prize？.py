while True:
    arr = []
    n = int(input())
    if n == 0:
        break
    for c in input().split():
        num = int(c)
        arr.append(abs(2023 - num))
    print(arr.index(min(arr)) + 1)
