for _ in range(int(input())):
    a = {}
    cards = input().split()
    for card in cards:
        if not card[0] in a:
            a[card[0]] = 1
        else:
            a[card[0]] += 1
    print(max(a.values()))
