for _ in range(int(input())):
    num = int(input())
    for _ in range(num // 5):
        print("++++", end=" ")
    for _ in range(num % 5):
        print("|", end="")
    print("")