for _ in range(int(input())):
    num, i = map(int, input().split())

    cnt = (str(bin(num))).count('1')

    if cnt % 2 == 0:
        if i == 0:
            print("Valid")
        else:
            print("Corrupt")
    else:
        if i == 1:
            print("Valid")
        else:
            print("Corrupt")