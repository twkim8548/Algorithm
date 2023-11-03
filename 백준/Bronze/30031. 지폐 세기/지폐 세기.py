import sys

input = sys.stdin.readline

tot = 0
for _ in range(int(input())):
    w, h = map(int, input().split())
    if w == 136:
        tot += 1000
    elif w == 142:
        tot += 5000
    elif w == 148:
        tot += 10000
    elif w== 154:
        tot += 50000

print(tot)