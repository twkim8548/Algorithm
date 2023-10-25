import sys

input = sys.stdin.readline

num = int(input())

for _ in range(num):
    str = input().strip()
    for c in str:
        if c == 'y':
            print('a', end="")
        elif c == 'a':
            print('e', end="")
        elif c == 'e':
            print('i', end="")
        elif c == 'i':
            print('o', end="")
        elif c == 'o':
            print('u', end="")
        elif c == 'u':
            print('y', end="")
        elif c == 'Y':
            print('A', end="")
        elif c == 'A':
            print('E', end="")
        elif c == 'E':
            print('I', end="")
        elif c == 'I':
            print('O', end="")
        elif c == 'O':
            print('U', end="")
        elif c == 'U':
            print('Y', end="")
        else:
            print(c, end="")
    print()


