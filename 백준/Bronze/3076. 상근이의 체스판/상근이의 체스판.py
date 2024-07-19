r, c = map(int, input().split())
a, b = map(int, input().split())

for i in range(r * a):
    for j in range(c * b):
        row = i // a
        col = j // b
        if (row + col) % 2 == 0:
            print('X', end='')
        else:
            print('.', end='')
    print()
