n = int(input())
for i in range(n):
    for j in range(n * 3):
        print('@', end='')
    for j in range(n):
        print(' ', end='')
    for j in range(n):
        print('@', end='')
    print()
for i in range(n * 3):
    for j in range(n):
        print('@', end='')
    for j in range(n):
        print(' ', end='')
    for j in range(n):
        print('@', end='')
    for j in range(n):
        print(' ', end='')
    for j in range(n):
        print('@', end='')
    print()
for i in range(n):
    for j in range(n):
        print('@', end='')
    for j in range(n):
        print(' ', end='')
    for j in range(n* 3):
        print('@', end='')
    print()