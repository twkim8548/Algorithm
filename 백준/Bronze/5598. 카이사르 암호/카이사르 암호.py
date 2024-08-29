s = input()

for c in s:
    if c == 'A':
        print('X', end='')
    elif c == 'B':
        print('Y', end='')
    elif c == 'C':
        print('Z', end='')
    else:
        print(chr(ord(c) - 3), end='')