while True:
    N, M = map(int, input().split())
    if N == 0 and M == 0:
        break
    tot = 0
    for a in input().split():
        money = int(a)
        if M/N < money:
            tot += M//N
        else:
            tot += money
    print(tot)