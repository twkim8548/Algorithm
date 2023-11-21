import math
import sys

input = sys.stdin.readline

white = 0
black = 0
for i in range(8):
    str = input()
    for c in str:
        if c == 'P':
            white += 1
        elif c == 'p':
            black += 1
        elif c == 'N':
            white += 3
        elif c == 'n':
            black += 3
        elif c == 'B':
            white += 3
        elif c == 'b':
            black += 3
        elif c == 'R':
            white += 5
        elif c == 'r':
            black += 5
        elif c == 'Q':
            white += 9
        elif c == 'q':
            black += 9

print(white - black)
