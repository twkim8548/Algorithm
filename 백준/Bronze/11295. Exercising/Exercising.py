cnt = 0
while True:
    l = int(input())
    if l == 0:
        break
    cnt += 1
    print(f"User {cnt}")
    for i in range(int(input())):
        n = int(input())
        print("{:.5f}".format((l * n) / 100000))
